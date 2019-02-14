https://www.pluralsight.com/guides/introduction-to-the-fork-join-framework

First, let's create a class that extends from RecursiveAction

```
public class SumAction extends RecursiveAction {

}
```

Next, let's choose a value that will indicate if the task is processed sequentially or in parallel.

The most basic case is when we have a list of two values. However, having subtasks that are so small can have a negative impact on performance because forking too much creates significant overhead cost through the recursive stack.

For this reason, we have to choose a value that represents the number of elements that can be processed sequentially without any problem. A value neither too small nor too big.

For this simple example, let's say a list of five elements is the right threshold:

```$xslt
public class SumAction extends RecursiveAction {
  private static final int SEQUENTIAL_THRESHOLD = 5;
}
```

Since the compute() method doesn't take parameters, you have to pass to the class constructor the data to work and save it as an instance variable:

```$xslt
public class SumAction extends RecursiveAction {
  // ...

  private List<Long> data;

  public SumAction(List<Long> data) {
    this.data = data;
  }
}
```

For each recursive call, we can create sublist without having to create a new list every time (remember that the sublist method returns a subview of the original list and not a copy). If we were working with arrays, probably it would be better to pass the whole array and the start and end index instead of creating smaller copies of the original array each time.

So the compute() method looks like this:

```$xslt
public class SumAction extends RecursiveAction {
  // ...

  @Override
  protected void compute() {
    if (data.size() <= SEQUENTIAL_THRESHOLD) { // base case
      long sum = computeSumDirectly();
      System.out.format("Sum of %s: %d\n", data.toString(), sum);
    } else { // recursive case
      // Calcuate new range
      int mid = data.size() / 2;
      SumAction firstSubtask =
          new SumAction(data.subList(0, mid));
      SumAction secondSubtask =
          new SumAction(data.subList(mid, data.size()));

      firstSubtask.fork(); // queue the first task
      secondSubtask.compute(); // compute the second task
      firstSubtask.join(); // wait for the first task result

      // Or simply call
      //invokeAll(firstSubtask, secondSubtask);
    }
  }
}
```

If the size of the list is equal or less than the threshold, the sum is computed directly and the result is printed.

Otherwise, the list is divided into two SumAction tasks. Then, the first task is forked while the result of the second is computed (this is the recursive call until the condition of the base case is fulfilled) and after that, we wait for the first task result.

The method to compute the sum can be as simple as:

```$xslt
public class SumAction extends RecursiveAction {
  // ...

  private long computeSumDirectly() {
    long sum = 0;
    for (Long l: data) {
      sum += l;
    }
    return sum;
  }
}
```

Finally, let's add a main method to execute the class:

```$xslt
public class SumAction extends RecursiveAction {
  // ...

  public static void main(String[] args) {
    Random random = new Random();

    List<Long> data = random
        .longs(10, 1, 5)
        .boxed()
        .collect(toList());

    ForkJoinPool pool = new ForkJoinPool();
    SumAction task = new SumAction(data);
    pool.invoke(task);
  }
}
```

In this method, a list of ten random numbers from one to four (the third parameter of the method longs represents the exclusive bound of the range) is generated and passed to a SumAction instance, which in turn is passed to a new ForkJoinPool instance to be executed.

If we run the program, this could be a possible output:

```$xslt
Sum of [1, 4, 4, 2, 3]: 14
Sum of [4, 1, 2, 1, 1]: 9
```

However, dividing the task may not always result in evenly distributed subtasks. For example, if we try with a list of eleven elements, this could be a possible output:

```$xslt
Sum of [1, 2, 2]: 5
Sum of [3, 3, 2]: 8
Sum of [2, 4, 1, 3, 3]: 13
```

Now, let's create a version of this class that extends from RecursiveTask and returns the sum of all the elements:

```$xslt
public class SumTask extends RecursiveTask<Long> {

}
```

We can copy the instance variables, the constructor and the computeSumDirectly() method:

```$xslt
public class SumTask extends RecursiveTask<Long> {
  private static final int SEQUENTIAL_THRESHOLD = 5;

  private List<Long> data;

  public SumTask(List<Long> data) {
    this.data = data;
  }

  // ...

  private long computeSumDirectly() {
    long sum = 0;
    for (Long l: data) {
      sum += l;
    }
    return sum;
  }
}
```

Changing the compute() method a little bit to return the sum value:

```$xslt
public class SumTask extends RecursiveTask<Long> {
  // ...

  @Override
  protected Long compute() {
    if (data.size() <= SEQUENTIAL_THRESHOLD) { // base case
      long sum = computeSumDirectly();
      System.out.format("Sum of %s: %d\n", data.toString(), sum);
      return sum;
    } else { // recursive case
      // Calcuate new range
      int mid = data.size() / 2;
      SumTask firstSubtask =
          new SumTask(data.subList(0, mid));
      SumTask secondSubtask =
          new SumTask(data.subList(mid, data.size()));

      // queue the first task
      firstSubtask.fork();

      // Return the sum of all subtasks
      return secondSubtask.compute()
              +
              firstSubtask.join();
    }
  }

  // ...
}
```

In its main() method, we only need to print the returned value from the task:

```$xslt
public class SumTask extends RecursiveTask<Long> {
  // ...

  public static void main(String[] args) {
    Random random = new Random();

    List<Long> data = random
        .longs(10, 1, 5)
        .boxed()
        .collect(toList());

    ForkJoinPool pool = new ForkJoinPool();
    SumTask task = new SumTask(data);
    System.out.println("Sum: " + pool.invoke(task));
  }
}
```

When we run the program, the following could be a possible output:

```$xslt
Sum of [4, 3, 1, 1, 1]: 10
Sum of [1, 1, 1, 2, 1]: 6
Sum: 16
```

package NumberSeries.Fibonacci;

public class MemoizeFibonacci {

    private static long[] cache;

    public static void main(String[] args) {
        int num = 9;
        cache = new long[num + 1];
        System.out.println(memoizeFib(num));
    }

    private static long memoizeFib(int n) {
        // Try cache first.
        if (cache[n] != 0) return cache[n];
        if (n == 0)
            return 1;
        long ans;
        if (n < 2)
            ans = 1;
        else
            ans = memoizeFib(n - 1) + memoizeFib(n - 2);
        // Don't subtract one.
        cache[n] = ans;
        return ans;
    }
}

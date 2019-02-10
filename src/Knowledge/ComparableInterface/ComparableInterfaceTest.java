package Knowledge.ComparableInterface;

/**
 * The Comparable interface is used by
 *
 * Collections.sort() method
 * java.util.Arrays.sort() method
 *
 * to sort Lists and arrays of objects, respectively. To implement Comparable, a class must implement a single method,
 * compareTo().
 *
 * int x = thisObject.compareTo(anotherObject);
 * The compareTo() method returns an int with the following characteristics:
 *
 * ■ negative If thisObject < anotherObject
 * ■ zero If thisObject == anotherObject
 * ■ positive If thisObject > anotherObject
 *
 * The sort() method uses compareTo() to determine how the List or object array
 * should be sorted.
 *
 */
public class ComparableInterfaceTest {
}

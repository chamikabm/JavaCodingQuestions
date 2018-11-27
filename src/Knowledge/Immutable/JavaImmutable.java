package Knowledge.Immutable;

public class JavaImmutable {


    /**
     *  What is meant by immutable?
     *
     *
     *  Immutable means that once the constructor for an object has completed execution that instance can't be altered.
     *
     * This is useful as it means you can pass references to the object around, without worrying that someone else
     * is going to change its contents. Especially when dealing with concurrency, there are no locking issues with
     * objects that never change
     *
     * e.g.
     *
     * class Foo
     * {
     *      private final String myvar;
     *
     *      public Foo(final String initialValue)
     *      {
     *          this.myvar = initialValue;
     *      }
     *
     *      public String getValue()
     *      {
     *          return this.myvar;
     *      }
     * }
     * Foo doesn't have to worry that the caller to getValue() might change the text in the string.
     *
     * If you imagine a similar class to Foo, but with a StringBuilderTest rather than a String as a member,
     * you can see that a caller to getValue() would be able to alter the StringBuilderTest attribute of a Foo instance.
     *
     * Also beware of the different kinds of immutability you might find: Eric Lippert wrote a blog article about this.
     * Basically you can have objects whose interface is immutable but behind the scenes actual mutables private state
     * (and therefore can't be shared safely between threads).
     */

    /**
     *
     *  Are Java primitives immutable?
     *
     *  If a method has a local variable i:
     *
     *      int i = 10;
     *
     *  and then I assign a new value:
     *
     *  Will this allocate a new memory location? Or just replace the original value?
     *
     *  ------------------------------------------------------------------------------------
     *
     *
     *  Will this allocate a new memory location? Or just replace the original value?
     *
     * Java does not really make any guarantees that variables will correspond to memory locations;
     * for example, your method might be optimized in such a way that i is stored in a register —
     * or might not even be stored at all, if the compiler can see that you never actually use its value,
     * or if it can trace through the code and use the appropriate values directly.
     *
     * But setting that aside . . . if we take the abstraction here to be that a local variable denotes a
     * memory location on the call stack, then i = 11 will simply modify the value at that memory location.
     * It will not need to use a new memory location, because the variable i was the only thing
     * referring to the old location.
     *
     *
     *
     * Does this mean that primitives are immutable?
     *
     * Yes and no: yes, primitives are immutable, but no, that's not because of the above.
     *
     * When we say that something is mutable, we mean that it can be mutated: changed while still having the
     * same identity. For example, when you grow out your hair, you are mutating yourself: you're still you,
     * but one of your attributes is different.
     *
     * In the case of primitives, all of their attributes are fully determined by their identity;
     * 1 always means  1, no matter what, and 1 + 1 is always 2. You can't change that.
     *
     * If a given int variable has the value 1, you can change it to have the value 2 instead,
     * but that's a total change of identity: it no longer has the same value it had before.
     * That's like changing me to point to someone else instead of to me: it doesn't actually change me,
     * it just changes me.
     *
     * With objects, of course, you can often do both:
     *
     *      StringBuilderTest sb = new StringBuilderTest("foo");
     *      sb.append("bar"); // mutate the object identified by sb
     *      sb = new StringBuilderTest(); // change sb to identify a different object
     *      sb = null; // change sb not to identify any object at all
     *
     * In common parlance, both of these will be described as "changing sb", because people will use "sb"
     * both to refer the variable (which contains a reference) and to the object that it refers to
     * (when it refers to one). This sort of looseness is fine, as long as you remember the distinction when it matters.
     *
     */


    public static void main(String[] args) {

        String myString = new String( "old String" );
        System.out.println( myString );
        myString.replaceAll( "old", "new" );
        System.out.println( myString );

        //
        System.out.println();
        //

        String myString2 = new String( "old String" );
        System.out.println( myString2 );
        myString2 = new String( "new String" );
        System.out.println( myString2 );


        //
        System.out.println();
        //

        String one = "Chamika";
        String two = "Chamika";

        if (one == two) {
            System.out.println("Pointing to the same object");
        } else {
            System.out.printf("Pointing to different objects.");
        }

        //
        System.out.println();
        //


        String three = new Integer(76).toString();
        String four = "76";

        if (three == four) {
            System.out.println("Pointing to the same object");
        } else {
            System.out.println("Pointing to different objects.");
        }


        //
        System.out.println();
        //


        String five = new String("123");
        String six = "123";

        if (five == six) {
            System.out.println("Pointing to the same object");
        } else {
            System.out.println("Pointing to different objects.");
        }

        //
        System.out.println();
        //

        /**
         * What will be output of below program?
         *
         * String s1 = "abc";
         * String s2 = new String("abc");
         * s2.intern();
         * System.out.println(s1 ==s2);
         *
         * It’s a tricky question and output will be false. We know that intern() method will return the
         * String object reference from the string pool, but since we didn’t assigned it back to s2,
         * there is no change in s2 and hence both s1 and s2 are having different reference.
         * If we change the code in line 3 to s2 = s2.intern(); then output will be true.
         *
         */

        String s1 = "abc";
        String s2 = new String("abc");

        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println(System.identityHashCode(s2.intern()));
        System.out.println(s1 == s2);
    }

}

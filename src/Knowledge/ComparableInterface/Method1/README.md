Java provides Comparable interface which should be implemented by any custom class if we want to use Arrays or Collections sorting methods. The Comparable interface has compareTo(T obj) method which is used by sorting methods, you can check any Wrapper, String or Date class to confirm this. We should override this method in such a way that it returns a negative integer, zero, or a positive integer if “this” object is less than, equal to, or greater than the object passed as an argument.

After implementing Comparable interface in Employee class, here is the resulting Employee class.

package LinkedList.ReverseSingleLinkList;

/**
 * Description:
 * Write a sample code to reverse Singly Linked List by iterating through it only once.
 *
 *
 * Recursive Method:
 * 	1) Divide the list in two parts - first node and rest of the linked list.
 * 	2) Call reverse for the rest of the linked list.
 * 	3) Link rest to first.
 * 	4) Fix head pointer
 *
 * 	Link:
 * 	    http://www.java2novice.com/java-interview-programs/revese-singly-linked-list/
 */
public class ReverseSingleLinkList {
    public static void main(String[] args) {
        SinglyLinkedListImpl<Integer> sl = new SinglyLinkedListImpl<>();
        sl.add(3);
        sl.add(32);
        sl.add(54);
        sl.add(89);
        System.out.println();
        sl.traverse();
        System.out.println();
        sl.reverse();
        sl.traverse();
    }
}

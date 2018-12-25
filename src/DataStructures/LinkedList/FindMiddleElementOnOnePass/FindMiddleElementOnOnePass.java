package DataStructures.LinkedList.FindMiddleElementOnOnePass;

/**
 * How to Find Middle Element of Linked List in Java in One Pass in Java
 *
 * Link : https://javarevisited.blogspot.com/2012/12/how-to-find-middle-element-of-linked-list-one-pass.html
 *
 * How do you find middle element of LinkedList in one pass is a programming question often asked Java and
 * non-Java programmers in telephonic Interview. This question is similar to checking palindrome or calculating
 * the factorial, where Interviewer sometimes also ask to write code. In order to answer this question candidate
 * must be familiar with LinkedList data structure i.e. In the case of singly LinkedList, each node of Linked List
 * contains data and pointer, which is the address of next Linked List and the last element of Singly Linked List points
 * towards the null. Since in order to find middle element of Linked List you need to find the length of LinkedList,
 * which is counting elements till end i.e. until you find the last element of Linked List. What makes this data structure
 * Interview question interesting is that you need to find middle element of LinkedList in one pass and you don’t know
 * the length of LinkedList. This is where candidates logical ability puts into the test,  whether he is familiar
 * with space and time trade off or not etc.
 *
 *
 */
public class FindMiddleElementOnOnePass {
    public static void main(String args[]) {
        //creating LinkedList with 5 elements including head
        LinkedList linkedList = new LinkedList();
        LinkedList.Node head = linkedList.head();
        linkedList.add( new LinkedList.Node("1"));
        linkedList.add( new LinkedList.Node("2"));
        linkedList.add( new LinkedList.Node("8"));
        linkedList.add( new LinkedList.Node("3"));
        linkedList.add( new LinkedList.Node("4"));

        //finding middle element of LinkedList in single pass
        LinkedList.Node current = head;
        int length = 0;
        LinkedList.Node middle = head;

        while(current.next() != null){
            length++;
            if(length%2 ==0){
                middle = middle.next();
            }
            current = current.next();
        }

        if(length%2 == 1){
            middle = middle.next();
        }

        System.out.println("length of LinkedList: " + length);
        System.out.println("middle element of LinkedList : " + middle);

    }

}

class LinkedList{
    private Node head;
    private Node tail;

    public LinkedList(){
        this.head = new Node("head");
        tail = head;
    }

    public Node head(){
        return head;
    }

    public void add(Node node){
        tail.next = node;
        tail = node;
    }

    public static class Node{
        private Node next;
        private String data;

        public Node(String data){
            this.data = data;
        }

        public String data() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public Node next() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public String toString(){
            return this.data;
        }
    }
}

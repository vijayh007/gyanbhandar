package tenDays.linkedList;

public class LinkedList {
    public static void main(String[] args) {
        Node node = new Node(10);
        Node node1 = new Node(20);
        Node node2 = new Node(30);
        Node node3 = new Node(40);

        Node head = node;
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = null;

        Basic.printLL(head);

//        Node newHead = ReverseLinkedList.reverse(head);
//        Basic.printLL(newHead);

        Node newHead1 = ReverseLinkedList.recursiveReverse(head);
        Basic.printLL(newHead1);

    }
}

package linkedlist;

public class A_CreateList {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node node1 = new Node(20);
        Node node2 = new Node(30);
        Node node3 = new Node(50);
        Node node4 = new Node(60);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        NodeUtil.printNode(head);
    }
}

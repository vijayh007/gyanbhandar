package linkedlist;

public class B_InsertLL {
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
        node4.next = null;

        //insert in starting
        Node newNode = new Node(5);
        newNode.next = head;
        head = newNode;
        NodeUtil.printNode(head);

        //Insert in between
        Node midNewNode = new Node(40);
        int position = 5;
        int count = 1;
        Node p = head;
        while(count <= position){
            count +=count;
            p = p.next;
        }
        Node newStore = p.next;
        p.next = midNewNode;
        midNewNode.next = newStore;
        NodeUtil.printNode(head);


        //Insert in Last
        Node lastNewNode = new Node(70);
        p = head;
        while (p.next != null){
            p = p.next;
        }
        p.next = lastNewNode;
        lastNewNode.next = null;
        NodeUtil.printNode(head);
    }
}

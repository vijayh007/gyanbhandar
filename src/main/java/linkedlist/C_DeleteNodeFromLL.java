package linkedlist;

public class C_DeleteNodeFromLL {
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

 /*       Node p = head.next;
        head = p;
        NodeUtil.printNode(head);*/

        int target = 60;
        Node  q = head;
        Node p = head.next;

        while (p.data != target){
            p = p.next;
            q = q.next;
        }
        if(p.next == null) {
            q.next = null;
        }else {
            q.next = p.next;
        }
        p = null;
        NodeUtil.printNode(head);


    }
}

package linkedlist;

public class D_ReverseLLRecursive {
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
        NodeUtil.printNode(reverse(head));
    }
    public static Node reverse(Node head) {
        if (head == null) return head;
        Node p = head;
        Node q = p.next;
        if (q == null) return p;
        q = reverse(q);
        p.next.next = p;
        p.next = null;
        return q;
    }
}

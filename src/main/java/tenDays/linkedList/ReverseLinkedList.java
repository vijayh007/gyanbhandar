package tenDays.linkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {

    }

    public static Node reverse(Node head){
        Node curr = head;
        Node pre = null;
        while(curr != null){
            Node temp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = temp;
        }
        return pre;
    }
    public static Node recursiveReverse(Node head){
        if (head == null || head.next == null) return head;
        Node newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}

package linkedlist;

public class NodeUtil {
    public static void printNode(Node head){
        Node p = head;
        while(p != null){
            System.out.print(p.data);
            System.out.print("-->");
            p = p.next;
        }
        System.out.print("null");
        System.out.println();
    }

}

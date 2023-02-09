package tenDays.linkedList;

public class Basic {
    public static void main(String[] args) {
        /* linked list :
         - no need to define size
         - dynamic size
         - Node{
                Node,
                data
                }
          - insertion is easy
          - deletion is easy in linked list

         */
    }
    public static void printLL(Node head){
        if(head == null){
            return;
        }
        while (head.next != null){
            System.out.print(head.data);
            System.out.print("-->");
            head = head.next;
        }
        System.out.println(head.data);
    }
}

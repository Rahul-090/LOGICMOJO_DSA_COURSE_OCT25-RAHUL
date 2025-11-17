package linkedList;

public class RemoveDuplicateFromSortedList {


    public static void main(String[] args){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(3);
        head.printLL(head);
        head.printLL(deleteDuplicates(head));
//        System.out.println("")
    }

    public static Node deleteDuplicates(Node head) {
        Node curr = head;
        while( curr != null && curr.next != null ){
            if(curr.val == curr.next.val){
                curr.next = curr.next.next;
            }else{
                curr = curr.next;
            }

        }
        return head;
    }
}



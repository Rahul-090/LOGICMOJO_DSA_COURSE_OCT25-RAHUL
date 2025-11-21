package linkedList;

public class ReverseLinkedList {
    public static void main(String [] args){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        head.printLL(head);
//        System.out.println("Reverse the LL: "+reverseLL(head));
        head.printLL(reverseLL2(head, 2, 5));
    }

    public static Node reverseLL2(Node head, int left, int right){
        Node dummy = new Node(0);
        dummy.next = head;
        Node newHead = dummy;
        Node curr = head;
        for(int i = 0; i < left-1 ; i++){
            newHead = curr;
            curr = curr.next;
        }

        Node newEnd = curr;
        Node prev = null;
        for(int i = 0; i < right-left ; i++ ){
             Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }

        newHead.next = prev;
        newEnd.next = curr;

        return dummy.next;


    }

    public static Node reverseLL(Node head){
        Node prev = null;
        Node curr = head;
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }


}

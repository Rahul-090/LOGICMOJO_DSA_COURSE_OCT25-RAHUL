package linkedList;

import static linkedList.ReverseLinkedList.reverseLL;

public class ReOrderLinkedList {

    public static void main(String [] args){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.printLL(head);
        ReorderLL(head);
        head.printLL(head);
    }

    public static Node ReorderLL(Node head){

        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node curr = slow;
        slow = reverseLL(curr);
        fast = head;

        Node dummy = new Node(0);
        dummy.next = fast;

        while( slow.next != null){
            Node temp1 = fast.next;
            Node temp2 = slow.next;

            fast.next = slow;
            slow.next = temp1;

            fast = temp1;
            slow = temp2;

        }

        return dummy.next;

    }
}

package linkedList;

public class IntersectionOfTwoLinkedList {
    public static void main(String [] args){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node head2 = new Node(1);
        head2.next = new Node(2);
        head2.next.next = new Node(3);
        head2.next.next.next = new Node(8);
        head2.next.next.next.next = head.next.next.next;

        head.printLL(head);
        head2.printLL(head2);
        head.printLL(intersectionOfLL(head, head2));


    }




    public static Node intersectionOfLL(Node headA, Node headB){

        int len1 = lengthOfLL(headA);
        int len2 = lengthOfLL(headB);

        Node curr1 = headA;
        Node curr2 = headB;

        while(len1 > len2){
            len1--;
            curr1 = curr1.next;
        }

        while(len2 > len1){
            len2--;
            curr2 = curr2.next;
        }

        while(curr1 != curr2){
            curr1 = curr1.next;
            curr2 = curr2.next;
        }

        return curr1;



    }

    static int lengthOfLL(Node head){
        Node curr = head;
        int len = 0;
        while(curr != null){
            len++;
            curr = curr.next;
        }
        return len;
    }
}

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
        head.printLL(intersectionOfLL2(head, head2));


    }

    //using floyd algo
    public static Node intersectionOfLL2(Node head1, Node head2){
        Node curr1 = head1;

        while(curr1.next != null){
            curr1 = curr1.next;
        }

        curr1.next = head2;

        Node slow = head1;
        Node fast = head1;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                slow = head1;

                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return slow;
    }



    public static Node intersectionOfLL(Node head1, Node head2){

        //length of 1s1 LL
        int len1 = 0;

        Node curr1 = head1;
        while(curr1 != null){
            len1++;
            curr1 = curr1.next;
        }

        //length of2nd ll
        int len2 = 0;
        Node curr2 = head2;
        while(curr2 != null){
            len2++;
            curr2 = curr2.next;
        }

        int diff = Math.abs(len1-len2);
        if(len1 > len2){
            while(diff > 0){
               head1 = head1.next;
               diff--;
            }

        }else{
            while(diff > 0){
                head2 = head2.next;
                diff--;
            }
        }

        while(head1 != head2){
            head1 = head1.next;
            head2 = head2.next;
        }

        return head1;

    }
}

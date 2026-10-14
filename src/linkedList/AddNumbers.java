package linkedList;

public class AddNumbers {

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

        head.printLL(head);
        head.printLL((addNumbers(head, head2)));
        /*
        1 -> 2-> 3-> 4-> 5
        1 -> 2-> 3-> 8
         */
    }

    public static Node addNumbers(Node head1, Node head2){
        int carry = 0;

        Node curr1 = head1;
        Node curr2 = head2;

        Node dummy = new Node(0);
        Node res = dummy;

        while(curr1 != null || curr2 != null){
                int x = (curr1 != null)?curr1.val:0;
                int y = (curr2 != null)?curr2.val:0;

                int sum = x + y + carry;

                carry = sum / 10;
                int digit = sum % 10;

                dummy.next = new Node(digit);
                dummy = dummy.next;

                if(curr1 != null ){
                    curr1 = curr1.next;
                }
                if(curr2 != null){
                    curr2 = curr2.next;
                }

        }
        return res.next;
    }

}

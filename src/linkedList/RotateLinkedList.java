package linkedList;

import static linkedList.ReverseNodesInKGroup.reverseLLL2;

public class RotateLinkedList {
    public static void main(String [] args){
//        Input: head -> 1 -> 2 -> 3 -> 4 -> 5, k = 2
//                      3->2->1->5->4
//                        4->5->1->2->3
//        Output: head -> 4 -> 5 -> 1 -> 2 -> 3

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

//        1->2->3->4->5

        head.printLL(head);
        head.printLL(rotateLL(head, 2));

    }

    public static Node rotateLL(Node head, int k){

        if(head == null || head.next == null){
            return head;
        }

        Node curr = head;
        int len = 0;

        while(curr != null){
            len++;
            curr = curr.next;
        }

        //if k > n
        k = k % len;

        // reverse first part
        head = reverseLLL2(head, 1, len-k);

        //reverse second part
        head = reverseLLL2(head, len-k+1, len);

        //rever whole LL
        head = reverseLLL2(head, 1, len);

        return head;



    }
}

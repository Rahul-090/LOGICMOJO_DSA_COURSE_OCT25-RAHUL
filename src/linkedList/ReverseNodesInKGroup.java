package linkedList;

public class ReverseNodesInKGroup {
    public static void main(String [] args){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

//        1->2->3->4->5

        head.printLL(head);
        head.printLL(reverseInGroup(head, 2));
    }


    public static Node reverseInGroup(Node head, int k){

        if(head == null || head.next == null){
            return head;
        }

        //find length
        Node curr = head;
        int len = 0;
        while(curr != null){
            len++;
            curr = curr.next;

        }

        int left = 1;
        int right = k;


        while(right <= len){
             head = reverseLLL2(head, left, right);
             left = right+1;
             right = left+k-1;
        }

        return head;


    }

    public static Node reverseLLL2(Node head, int left, int right){

        if(head == null || head.next == null){
            return head;
        }
        Node dummy = new Node(0);
        dummy.next = head;

        Node curr = head;
        Node newHead = dummy;

        for(int i = 0; i < left-1; i++){
            newHead = curr;
            curr = curr.next;
        }

        Node newEnd = curr;
        Node prev = null;


        for(int i = 0; i < right-left+1; i++){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        newHead.next = prev;
        newEnd.next = curr;

        return dummy.next;

    }
}

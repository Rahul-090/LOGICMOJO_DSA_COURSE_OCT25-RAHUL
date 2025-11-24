package linkedList;

import static linkedList.ReverseLinkedList.reverseLL;

public class PlindromeLinkedList {
    public static void main(String [] args){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);
//        head.next.next.next.next = new Node(1);
        System.out.println("Is Palindrome: "+palindromeLL(head));
    }




    public static boolean palindromeLL(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        if(fast != null){ //means odd length
            slow = slow.next;
        }

        //reverse
        slow = reverseLL(slow);
        fast = head;

        while(slow != null){
            if(slow.val != fast.val){
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }

    public static boolean palindromeLLL(Node head){


        if(head == null){
            return true;
        }

        Node slow = head;
        Node fast = head;
        Node slowPrev = head;
        while(fast != null && fast.next != null){
            if(slow != head){
                slowPrev = slowPrev.next;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        Node curr;
        if(lengthOfLL(head) % 2 == 0){
             curr = slow;
             slowPrev = null;
        }else{
             curr = slow.next;
             slow.next = null;
        }


        Node prev = null;

        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        slow  = head;

        while(prev != null){
            if(prev.val != slow.val){
                return false;
            }
            prev = prev.next;
            slow = slow.next;
        }

        return true;



    }

    public static int lengthOfLL(Node head){
        Node curr = head;
        int len = 0;

        while(curr != null){
            len++;
            curr = curr.next;
        }
        return len;
    }

}

package linkedList;

public class DetectCycleInLL {
    public static void main(String[] args){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next =  head;

//        head.printLL(head);
        System.out.println("Detect Cycle in LL: "+lengthOfCycle(head));
    }

    public static boolean hasCycle(Node head) {
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    public static int lengthOfCycle(Node head){
        Node fast = head;
        Node slow = head;
        int len = 0;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                slow = slow.next;
                len++;
                while(slow!= fast){
                    len++;
                    slow = slow.next;
                }
                break;
            }
        }
        return len;

    }
}

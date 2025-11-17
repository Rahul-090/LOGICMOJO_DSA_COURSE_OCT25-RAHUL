package linkedList;

public class Node{
    int val;
    Node next;

    Node(int val){
        this.val = val;
        this.next = null;
    }

    void printLL(Node head){
        while(head.next != null){
            System.out.print(head.val+"->");
            head = head.next;
        }
        System.out.print(head.val);
        System.out.println();
    }
}

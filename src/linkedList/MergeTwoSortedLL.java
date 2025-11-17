package linkedList;

public class MergeTwoSortedLL {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        Node head2 = new Node(1);
        head2.next = new Node(3);
        head2.next.next = new Node(4);
        head2.next.next.next = new Node(5);

        head.printLL(head);
        head.printLL(head2);
        head.printLL(mergeTwoSortedLL(head, head2));
    }

    public static Node mergeTwoSortedLL(Node list1, Node list2) {
        Node res = new Node(0);
        Node dummy = res;

        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                res.next = list1;
                list1 = list1.next;
            } else {
                res.next = list2;
                list2 = list2.next;
            }
            res = res.next;
        }

        if (list1 != null) {
            res.next = list1;
        }

        if (list2 != null) {
            res.next = list2;
        }

        return dummy.next;

    }
}

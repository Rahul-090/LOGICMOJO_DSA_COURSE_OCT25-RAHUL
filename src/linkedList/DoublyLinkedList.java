
package linkedList;

public class DoublyLinkedList {
    DoublyNode head;
    DoublyNode tail;

    // Insert at the begining
    public void insertAtHead(int data) {
        DoublyNode newNode = new DoublyNode(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }
        head.prev = newNode;
        newNode.next = head;
        head = newNode;

    }

    // Insert at the end
    public void inserAtEnd(int data) {
        DoublyNode newNode = new DoublyNode(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Insert at any position (o based indexing)
    public void insertAtPosition(int data, int position) {
        DoublyNode newNode = new DoublyNode(data);

        if (position == 0) {
            insertAtHead(data);
            return;
        }
        DoublyNode curr = head;
        for (int i = 0; i < position - 1 && curr != null; i++) {
            curr = curr.next;
        }

        if (curr.next == null) {
            inserAtEnd(data);
            return;
        }

        // out of bound
        if (curr == null) {
            return;
        }

        DoublyNode nextNode = curr.next;

        curr.next = newNode;
        newNode.next = nextNode;

        newNode.prev = curr;
        nextNode.prev = newNode;
    }

    // Delete from the beginning
    public void deleteFromHead() {
        if (head == null) {
            return;
        }

        // if list has only one node
        if (head == tail) {
            head = tail = null;
            return;
        }
        head = head.next;
        head.prev = null;
    }

    // Delete from end;
    public void deleteFromEnd() {
        if (tail == null) {
            return;
        }

        // if only one node
        if (tail == head) {
            head = tail = null;
            return;
        }

        tail = tail.prev;
        tail.next = null;
    }

    // Delete at specific position(0 based indexing)
    public void deleteAtPosition(int position) {

        if (position == 0) {
            deleteFromHead();
            return;
        }
        DoublyNode curr = head;
        for (int i = 0; i < position - 1; i++) {
            curr = curr.next;
        }

        DoublyNode nodeToDelete = curr.next;

        // delete node at last position
        if (nodeToDelete.next == null) {
            deleteFromEnd();
            return;
        }

        curr.next = nodeToDelete.next;
        nodeToDelete.prev = curr;
    }

    public void printDLL() {
        DoublyNode curr = head;

        while (curr.next != null) {
            System.out.print(curr.data + " ->");
            curr = curr.next;
        }
        System.out.print(curr.data);
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertAtHead(1);
        dll.inserAtEnd(2);
        dll.insertAtPosition(3, 2);
        dll.insertAtPosition(2, 2);
        dll.deleteFromEnd();
        dll.deleteFromHead();
        dll.insertAtHead(1);
        dll.deleteFromEnd();
        dll.inserAtEnd(3);
        dll.deleteAtPosition(1);
        dll.printDLL();
    }
}
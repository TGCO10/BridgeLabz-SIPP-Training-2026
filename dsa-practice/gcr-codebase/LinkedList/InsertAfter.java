package gcrCodebase.LinkedList;

public class InsertAfter {
    static void insertAfter(Node current, int value) {
        if (current == null)
            return;

        Node newNode = new Node(value);
        newNode.next = current.next;
        current.next = newNode;
    }
}
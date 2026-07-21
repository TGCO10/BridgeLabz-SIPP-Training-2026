package gcrCodebase.LinkedList;

public class DeleteNode {
    static Node delete(Node head, int value) {

        if (head == null)
            return null;

        if (head.data == value)
            return head.next;

        Node prev = head;
        Node curr = head.next;

        while (curr != null && curr.data != value) {
            prev = curr;
            curr = curr.next;
        }

        if (curr != null)
            prev.next = curr.next;
        return head;
    }
}
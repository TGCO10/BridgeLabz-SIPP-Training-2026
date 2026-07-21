package gcrCodebase.Stack;

class CallStack {
    static class Node {
        String functionName;
        Node next;

        Node(String name, Node next) {
            this.functionName = name;
            this.next = next;
        }
    }

    Node top = null;
    void push(String functionName) {
        top = new Node(functionName, top);
    }

    String pop() {
        if (top == null)
            throw new RuntimeException("Empty Stack");
        String value = top.functionName;
        top = top.next;
        return value;
    }

    String peek() {
        if (top == null)
            throw new RuntimeException("Empty Stack");
        return top.functionName;
    }
    boolean isEmpty() {
        return top == null;
    }
}
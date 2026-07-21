package gcrCodebase.Stack;

class UndoBuffer {
    private String[] data;
    private int top;

    UndoBuffer(int capacity) {
        data = new String[capacity];
        top = -1;
    }

    boolean push(String edit) {
        if (top == data.length - 1) {
            System.out.println("Stack Overflow");
            return false;
        }
        data[++top] = edit;
        return true;
    }

    String pop() {
        if (isEmpty())
            throw new RuntimeException("Stack Underflow");
        return data[top--];
    }

    String peek() {
        if (isEmpty())
            throw new RuntimeException("Stack Empty");
        return data[top];
    }
    boolean isEmpty() {
        return top == -1;
    }
}
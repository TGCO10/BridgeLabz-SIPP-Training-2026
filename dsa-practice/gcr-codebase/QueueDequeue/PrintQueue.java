package gcrCodebase.QueueDequeue;

import java.util.*;

public class PrintQueue {
    Deque<Integer> queue = new ArrayDeque<>();
    void addNormal(int jobId) {
        queue.addLast(jobId);
    }

    void addUrgent(int jobId) {
        queue.addFirst(jobId);
    }
    int printNext() {
        if (queue.isEmpty())
            throw new RuntimeException("Queue Empty");
        return queue.removeFirst();
    }

    public static void main(String args[]) {
        PrintQueue p = new PrintQueue();
        p.addNormal(101);
        p.addNormal(102);
        p.addUrgent(999);
        System.out.println(p.printNext());
    }
}
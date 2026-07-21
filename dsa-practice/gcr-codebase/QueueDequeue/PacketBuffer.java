package gcrCodebase.QueueDequeue;

class PacketBuffer {
    private int[] data;
    private int front;
    private int count;

    PacketBuffer(int capacity) {
        data = new int[capacity];
        front = 0;
        count = 0;
    }

    boolean enqueue(int packetId) {
        if (count == data.length) {
            System.out.println("Buffer Full");
            return false;
        }

        data[(front + count) % data.length] = packetId;
        count++;
        return true;
    }

    int dequeue() {
        if (count == 0)
            throw new RuntimeException("Buffer Empty");
        int value = data[front];
        front = (front + 1) % data.length;
        count--;
        return value;
    }

    boolean isEmpty() {
        return count == 0;
    }
    boolean isFull() {
        return count == data.length;
    }
}
package stack;

public class Queue {
    private int rear;
    private int front;
    private int size;
    private final int capacity;
    private final char[] queueArray;

    public Queue(int capacity) {
        this.capacity = capacity;
        this.rear = -1;
        this.front = 0;
        this.size = 0;
        this.queueArray = new char[capacity];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void insert(char value) {
        if (isFull()) {
            System.out.println("Queue is Full");
            return;
        }

        rear = (rear + 1) % capacity;
        queueArray[rear] = value;
        size++;
    }

    public char delete() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return '\0';
        }

        char value = queueArray[front];
        front = (front + 1) % capacity;
        size--;
        return value;
    }

    public char peekFront() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return '\0';
        }

        return queueArray[front];
    }
}

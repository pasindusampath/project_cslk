import java.util.NoSuchElementException;

/**
 * A simple fixed-capacity, circular-buffer queue with generic element type
 * and proper exception handling.
 */
public class GenericQueue<E> {
    private final E[] elements;
    private int front, rear, size;

    @SuppressWarnings("unchecked")
    public GenericQueue(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be positive");
        }
        elements = (E[]) new Object[capacity];
        front = rear = size = 0;
    }

    public void enqueue(E item) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }
        elements[rear] = item;
        rear = (rear + 1) % elements.length;
        size++;
    }

    public E dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        E item = elements[front];
        elements[front] = null;
        front = (front + 1) % elements.length;
        size--;
        return item;
    }

    public E peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return elements[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == elements.length;
    }

    public int size() {
        return size;
    }
}

/**
 * Demo for GenericQueue usage
 */
class GenericQueueDemo {
    public static void main(String[] args) {
        GenericQueue<Integer> queue = new GenericQueue<>(5);
        System.out.println("Enqueueing 1 to 5");
        for (int i = 1; i <= 5; i++) {
            queue.enqueue(i);
        }
        System.out.println("Dequeued elements:");
        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }
        try {
            queue.dequeue();
        } catch (Exception e) {
            System.out.println("Expected exception: " + e.getMessage());
        }
    }
}
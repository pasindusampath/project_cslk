package stack;

import java.util.Scanner;

public class Main {

    private static final int MAX_SIZE = 10;

    public static void main(String[] args) {
        Queue queue = new Queue(MAX_SIZE);
        Stack stack = new Stack(MAX_SIZE);

        try (Scanner scanner = new Scanner(System.in)) {
            collectInput(scanner, queue, stack);
            mirrorStackToQueue(stack, queue);
            displayFinalQueue(queue);
        }
    }

    private static void collectInput(Scanner scanner, Queue queue, Stack stack) {
        System.out.println("Insert 5 characters in ascending order:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter character " + (i + 1) + ": ");
            char value = scanner.next().charAt(0);
            queue.insert(value);
            stack.push(value);
        }
    }

    private static void mirrorStackToQueue(Stack stack, Queue queue) {
        while (!stack.isEmpty()) {
            queue.insert(stack.pop());
        }
    }

    private static void displayFinalQueue(Queue queue) {
        System.out.println("Final list elements of the queue:");
        while (!queue.isEmpty()) {
            System.out.println(queue.delete());
        }
    }
}

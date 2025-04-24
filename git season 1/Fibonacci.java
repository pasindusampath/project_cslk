public class Fibonacci {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2); 
    }

    public static void main(String[] args) {
        int[] n = {10, 9, 8, 7};
        for (int i : n) {
            System.out.println("Fibonacci number at " + i + " is: " + fibonacci(i));
        }  
    }
}

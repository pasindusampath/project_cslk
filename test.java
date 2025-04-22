import java.util.Scanner;


public class test {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.err.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.err.println("Enter the elements of the array: ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            System.err.println("Element " + i + ": " + arr[i]);
        }
        System.err.println("The elements of the array are: ");
        for (int i = 0; i < n; i++) {
            System.err.println(arr[i]);
        }
       



    }
    
}

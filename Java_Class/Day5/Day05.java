package Day5;
import java.util.Scanner;

public class Day05 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = obj.nextLine();

        System.out.print("Enter marks: ");
        int mark = obj.nextInt();

        if (mark >= 50) {
            System.out.println(name + "'s marks are greater than or equal to 50, so he is pass.");
        } else {
            System.out.println(name + " has failed.");
        }
    }
}

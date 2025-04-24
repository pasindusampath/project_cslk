package Day6;
import java.util.Scanner;

public class day6 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter Your Old Salary: ");
        int salary = obj.nextInt();
        int bonus = 0;

        if (salary < 80000) {
            bonus = salary * 20 / 100;
        }

        int newSalary = salary + bonus;

        System.out.println("Bonus: " + bonus);
        System.out.println("New Salary: " + newSalary);

    }
}

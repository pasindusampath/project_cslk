import java.util.Scanner;

class solutions {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a salary : ");
        double salary = input.nextDouble();

        double bonus = 0;
        boolean isBonusAvailable = false;

        // If salary is less than 80,000, calculate bonus
        if (salary < 80000) {
            bonus = salary * 0.20; // 20% bonus
            isBonusAvailable = true;
        }

        double finalSalary = salary + bonus;

        // Output details
        System.out.println("Is bonus available : " + isBonusAvailable);
        System.out.println("Amount of bonus    : " + bonus);
        System.out.println("Final salary (s+b) : " + finalSalary);

        input.close();
    }
}

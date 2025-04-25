import java.util.Scanner;

public class Light {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter lightning value: ");
        int lightning = input.nextInt();

        System.out.print("Enter time (24-hour format): ");
        int time = input.nextInt();

        if (lightning >= 20 && time == 18) {
            System.out.println("The light is ON.");
        }
        else if ((lightning > 24) && (lightning < 0)) {
            System.out.println("Please choose a time correctly!");
        } else {
            System.out.println("The light is OFF.");
        }

        input.close();
    }
}

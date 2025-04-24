public class Example {
    public static void main(String[] args) {
        System.out.println(10 + 20 + 30 + 40); // 100 //Arithmatic Addition
        System.out.println(10 + 20 + "10" + 30 + 40); // 30103040 //String Concat
        System.out.println(10 + "20" + 30 + 40); // 10203040
        System.out.println(10 + "20" + 5 + 40); // 1020540
        System.out.println(10 + 30 + 40 + "20"); // 8020
        System.out.println("20" + 10 + 30 + 40); // 20103040

        // System.out.println(10 + 20 + "30" + 10 + 20); // 30301020
        // System.out.println(10 + 20 + "30" + (10 + 20)); // 303030

        // int x = 20;
        // int y = 10;
        // System.out.println(x + " + " + y + " = " + (x + y));
        // System.out.println(x + " - " + y + " = " + (x - y));
        // System.out.println(x + " / " + y + " = " + (x / y));
        // System.out.println(x + " * " + y + " = " + (x * y));

        int height = 10;
        int width = 4;
        int length = 5;
        // area & parimeter

        System.out.println("Volume => " + height + " * " + width + " * " + length + " = " + (height * length * width));
    }
}

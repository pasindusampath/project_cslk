public class Test {
    public static void main(String[] args) {

        byte a = 10;
        int b = a;
        System.out.println(b); // Wide Conversion

        // int c = 10;
        // byte d = c;
        // System.out.println(d); // Narrow Conversion

        int e = 10;
        byte f = (byte) e;
        System.out.println(f); // Narrow Casting

        byte g = 10;
        int h = (int) g;
        System.out.println(h); // Wide Casting

        int i = 130;
        byte j = (byte) i;
        System.out.println(j); // Narrow Casting
    }
}

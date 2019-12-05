public class StaticDemo {
    static int i;
    int j;

    static {
        System.out.println("in static block");
        i = 100;
    }

    public static void main(String[] args) {
        System.out.println("in Main");
        System.out.println("i: " + i);
    }
}

public class MethodOverloadingExample {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        MethodOverloadingExample example = new MethodOverloadingExample();

        System.out.println("Sum of integers: " + example.add(10, 20));
        System.out.println("Sum of doubles: " + example.add(10.5, 20.5));
    }
}

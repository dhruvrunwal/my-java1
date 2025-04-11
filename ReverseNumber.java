public class ReverseNumber {
    public static void main(String[] args) {
        int number = 4567;
        System.out.println("Reversed: " + reverse(number));
    }

    public static int reverse(int n) {
        int rev = 0;
        while (n != 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }
        return rev;
    }
}

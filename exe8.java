public class exe8 {
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int result = factorial(7);
        System.out.println("The factorial of 7 is :" + result);
    }
}
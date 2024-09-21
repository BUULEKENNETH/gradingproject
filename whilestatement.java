import java.util.Scanner;

public class whilestatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctPin = "2929";
        int attempts = 3;
        while (attempts > 0) {
            System.out.println("Enter the Pin: ");
            String input = sc.nextLine();

            if (input.equals(correctPin)) {
                System.out.println("Success! Pin");
            } else {
                attempts--;
                System.out.println("Incorrect Pin. Attempts remaining: " + attempts);

            }
            if (attempts == 0) {
                System.out.println("Account  blocked.");
            }
        }
        sc.close();
    }

}

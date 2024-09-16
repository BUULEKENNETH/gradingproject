
//using switch to grade
import java.util.Scanner;

public class switchgrading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks: ");
        int marks = scanner.nextInt();

        switch (marks / 10) {
            case 10:
            case 9:
                System.out.println("Excellent");
                break;
            case 8:
                System.out.println("Very Good");
                break;
            case 7:
                System.out.println("Good");
                break;
            case 6:
                System.out.println("Medium");
                break;
            case 5:
                System.out.println("Pass");
                break;
            default:
                System.out.println("Fail");
                break;
        }
        scanner.close();
    }
}
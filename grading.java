import java.util.Scanner;

public class grading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(":Enter marks:");
        int marks = scanner.nextInt();
        if (marks >= 90) {
            System.out.println("Excellent");
        } else if (marks >= 80) {
            System.out.println("Very Good");
        } else if (marks >= 70) {
            System.out.println("Good");
        } else if (marks >= 60) {
            System.out.println("Medium");

        } else if (marks >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        scanner.close();
    }

}
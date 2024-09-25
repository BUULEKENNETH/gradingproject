
/*import java.util.Arrays; // Importing the Arrays class
import java.util.Collections;

public class exearray {
    public static void main(String[] args) {
        // Declaring and initializing an array
        int[] numbers = { 5, 3, 8, 1, 2 };

        // Printing the original array
        System.out.println("Original array: " + Arrays.toString(numbers));

        // Sorting the array
        Arrays.sort(numbers, Collections.reverseOrder());

        // Printing the sorted array
        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }

}*/
import java.util.Arrays;
import java.util.Collections;

public class exearray {
    public static void main(String[] args) {
        // Create an array with the numbers
        Integer[] numbers = { 5, 3, 8, 1, 2 };

        // Sort the array in descending order
        Arrays.sort(numbers, Collections.reverseOrder());

        // Print the sorted array
        System.out.println("Sorted numbers in descending order: " + Arrays.toString(numbers));
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class  AscendingAndDescending {
    public static void main (String[] args){
        Scanner scanner =  new Scanner(System.in);

        // Prompt the user to enter three integers
        System.out.println("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second integer: ");
        int num2 = scanner.nextInt();

        System.out.println("Enter the third integer: ");
        int num3 = scanner.nextInt();

        // Sort the array in ascending order
        int[] numbers = { num1, num2, num3 };

        // Sort the array in ascending order
        Arrays.sort(numbers);

        // Display the numbers in ascending order
        System.out.println("Ascending order: " + Arrays.toString(numbers));

        // Display the numbers in descending order
        System.out.println("Descending order: " + Arrays.toString(reverseArray(numbers)));

        scanner.close();
    }
        // Function to reverse an array
        private static int [] reverseArray(int[] arr){
            int[] reversed = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                reversed[i] = arr[arr.length - i - 1];
            }
            return reversed;
        }
    }


import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check and print result
        if (number > 0) {
            System.out.println("The number is positive");
        } else if (number < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is zero");
        }
        input.close();      
    }
}


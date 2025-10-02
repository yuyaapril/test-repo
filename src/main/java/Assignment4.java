import java.util.ArrayList;
import java.util.Scanner;

public class Assignment4 {
    
    // Method to split name into ArrayList
    public static ArrayList<String> splitName(String fullName) {
        String[] parts = fullName.split(" ");
        ArrayList<String> nameList = new ArrayList<>();
        for (String part : parts) {
            nameList.add(part);
        }
        return nameList;
    }

    // Method to print name in reverse
    public static void printReverse(ArrayList<String> nameList) {
        System.out.print("Reverse name = ");
        for (int i = nameList.size() - 1; i >= 0; i--) {
            System.out.print(nameList.get(i) + " ");
        }
        System.out.println();
    }

    // Method to print real/original name
    public static void printReal(ArrayList<String> nameList) {
        System.out.print("Real name = ");
        for (String name : nameList) {
            System.out.print(name + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter your full name: ");
        String fullName = sc.nextLine();

        // Store in ArrayList
        ArrayList<String> nameList = splitName(fullName);

        // Output
        printReverse(nameList);
        printReal(nameList);

        sc.close();
    }
}

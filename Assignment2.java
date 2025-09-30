public class Assignment2 {
    public static void main(String[] args) {
        int n = 7; // max number

        // upper part
        for (int i = 1; i <= n; i++) {

            for (int s = 1; s < i; s++) {
                System.out.print(" ");
            }

            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        /*Upper Part:

         The value of i increases step by step.

         The leading spaces are equal to i - 1.

         The inner loop variable j runs from i to n.*/

        // lower part
        for (int i = n - 1; i >= 1; i--) {

            for (int s = 1; s < i; s++) {
                System.out.print(" ");
            }

            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
            /*Lower Part:

           The outer loop variable i decreases from n - 1 down to 1.

           The leading spaces are equal to i - 1.

           The inner loop variable j runs from i to n.*/
        }
    }
}


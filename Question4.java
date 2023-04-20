import java.util.Scanner;

public class Question4
{
   public static void main(String[] args) {
        /**
         * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
         *    e.g.
         *     > 5
         *     *****
         *     ****
         *     ***
         *     **
         *     *
         * 
         * Hint: 2 loops are required. System.out.print(...) to print on single line.
         */
         
        Scanner in = new Scanner(System.in);
        
//         System.out.print("Enter the base of the triangle: ");
//         int base = in.nextInt();
        
        for (int i = base; i >= 1; i--) {    // outer loop for rows
            for (int j = 1; j <= i; j++) {   // inner loop for columns
                System.out.print("*");
            }
            System.out.println();   // move to the next line after each row is printed
        }
    }
}

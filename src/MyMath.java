import java.util.Scanner;
/*
*@author Bridget Acosta
* 10/13/2022
 */
public class MyMath {
    //Use the flowchart above to implement a method gcf in the MyMath class
    // that calculates the greatest common factor of 2 numbers.
    //Hint 1: This flowchart depicts a while loop and conditional
    private final static Scanner s = new Scanner(System.in);

    public static void gcf() {

        System.out.println("Type a number:");
        int a = Integer.parseInt(s.nextLine());
        System.out.println("Type a number:");
        int b = Integer.parseInt(s.nextLine());

        while (b != 0) {
            if (a > b) {
                int c = b;
                b = a % b;
                a = c;
                System.out.println("GCF is: " +c);
            } else {
                b = b % a;
            }
        }
    }
        public static void main (String[]args) {
            gcf();
        }
    }

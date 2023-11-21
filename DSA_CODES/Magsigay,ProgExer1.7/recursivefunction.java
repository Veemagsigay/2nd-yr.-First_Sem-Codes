import java.util.Scanner;
import java.util.Stack;

public class recursivefunction {

    public static Stack<Character> stack = new Stack<>();

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("decimal value: ");
            int m = in.nextInt();
             if (m < 0){
                System.out.print("thank you for using the program. bye! ");
                break;
             }

            System.out.print("target base: ");
            int n = in.nextInt();
            in.nextLine();

            if (m < 2 || m > 16) {

                System.out.println("\nInvalid Base!");
            } else {
                System.out.println("value of " + m + " in base " + n + " is " + recursive(m, n));
            }
            

        }

    }

    public static String recursive(int m, int n) {

        String[] x = { "0", "1", "2", "3", "4", "5", "6", " 7", "8", "9", "A",
                "B", "C", "D", "E", "F" };

        int rem = m % n;
        int quo = m / n;

        if (quo > 0) {

            return recursive(quo, n) + x[rem];
        } else {
            return x[rem];
        }

    }
}

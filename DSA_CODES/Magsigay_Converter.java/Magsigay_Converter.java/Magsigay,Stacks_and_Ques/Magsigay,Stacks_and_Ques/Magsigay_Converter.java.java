import java.util.*;

public class example {
    public static void main(String[] args) {

        Stack<Character> stack = new Stack<>();

        int base;
        char[] x = { '0', '1', '2', '3', '4', '5', '6', '7', '8' };

        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = in.nextInt();

        while (true) {
            System.out.print("Enter Base Between 2 to 9: ");
            base = in.nextInt();
            in.nextLine();
            
            if (base < 2 || base > 9) {

                System.out.println("\nInvalid Base!");
            }
            else {
                break;
            }
        }

        while (number > 0) {
            int quotient = number / base;
            int modulo = number % base;

            stack.push(x[modulo]);
            if (quotient == 0) {
                System.out.println("Finally, Division: " + number + " / " + base + " = " + quotient + " Remainder: " + modulo);
            } else
                System.out.println("Division: " + number + " / " + base + " = " + quotient + " Remainder: " + modulo);
            number = quotient;
        }

        System.out.print("\n The number express in the Number System: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }

    }
}
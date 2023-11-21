import java.io.File;
import java.io.IOException;

import java.util.Scanner;

public class IntBSTMain {
    public static BST inbst = new BST();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            File file = new File("bst.txt");
            if (file.createNewFile()) {
            } else {
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            File file = new File("bst.txt");
            Scanner in = new Scanner(file);

            while (in.hasNextLine()) {
                inbst.insert(Integer.parseInt(in.nextLine()));
            }

            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print("Search for the number: ");
        String prompt = input.nextLine();

        if (inbst.search(inbst.root, Integer.parseInt(prompt))) {
            System.out.println("Number found!");
            System.out.println("Found on counting " + inbst.checkCount() + " nodes.");
            inbst.resetCount();
        } else {
            System.out.println("Number not found...");
            System.out.println("Checked upon counting " + inbst.checkCount() + " nodes.");
            inbst.resetCount();
        }

        input.close();
    }
}

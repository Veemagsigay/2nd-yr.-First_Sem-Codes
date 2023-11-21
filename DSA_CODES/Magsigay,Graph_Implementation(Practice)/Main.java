import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static Scanner in = new Scanner(System.in);
    public static void scanfiles(ArrayList<String> seegraph) {
        
        try {
            File file = new File("graph.txt");
            if (file.createNewFile()) {
            } else {
            }
        } catch (IOException e) {
        }

        try {

            File file = new File("graph.txt");
            Scanner scanfile = new Scanner(file);
            scanfile.useDelimiter(",\\s");

            while (scanfile.hasNext()) {
                String vertices = scanfile.nextLine();
                String edges = scanfile.nextLine();
                seegraph.add(vertices);
                seegraph.add(edges);

                in.close();
            }
        } catch (IOException e) {
        }

    }

    public static void main(String[] args) {

        ArrayList<String> seegraph = new ArrayList<>();
        scanfiles(seegraph);

        System.out.println("");
        System.out.println(seegraph);
        System.out.printf("%-30s%-10s\n", "Vertices, Edges");
        System.out.println("");

        in.nextLine();

    }
}
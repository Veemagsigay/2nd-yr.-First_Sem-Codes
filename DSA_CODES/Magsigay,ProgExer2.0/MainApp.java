import java.io.IOException;

public class MainApp {
    public static void main(String[] args) throws IOException {
        graph graph = new graph();
        System.out.println("Adjacency List:");
        graph.usedreadinggraph("graph.txt");
        graph.dispplayadjacent();
        System.out.println();
        System.out.println("Incidence Matrix:");
        graph.displayedges();
    }
}
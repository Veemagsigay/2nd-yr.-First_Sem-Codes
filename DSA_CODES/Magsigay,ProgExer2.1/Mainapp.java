import java.io.*;
import java.util.*;

public class Mainapp {
    public static void main(String[] args) throws IOException {

        ArrayList<edge>[] graph;
        File file = new File("graph.txt");
        Scanner in = new Scanner(System.in);
        Scanner checksze = new Scanner(file);
        Scanner edgchecker = new Scanner(file);
        int size = 0;

        while (checksze.hasNextLine()) {
            String temp = checksze.nextLine();
            if (temp.length() == 1)
                size++;
        }

        graph = new ArrayList[size];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        while (edgchecker.hasNextLine()) {
            String temp = edgchecker.nextLine();
            if (temp.length() != 1) {
                String length = "" + temp.charAt(4);
                if (temp.length() == 6)
                    length += temp.charAt(5);
                int weight = Integer.parseInt(length);
                graph[temp.charAt(0) - 65].add(new edge(temp.charAt(0), temp.charAt(2), weight));
            }
        }

        System.out.print("Starting Vertex: ");
        char src = in.next().charAt(0);

        Queue<Dijkstra> traversal = new LinkedList<>();
        traversal.add(new Dijkstra(src, 0));
        ArrayList<Dijkstra> shortestPath = new ArrayList<>();

        while (traversal.size() > 0) {
            Dijkstra elementtop = traversal.remove();

            if (shortestPath.isEmpty())
                shortestPath.add(elementtop);

            else if (!shortestPath.isEmpty()) {
                boolean vertexisted = false;
                Dijkstra shortestpath;
                int index = 0;
                for (Dijkstra e : shortestPath) {
                    if (e.vertex == elementtop.vertex) {
                        vertexisted = true;
                        shortestpath = e;
                        if (elementtop.partialweigiht < shortestpath.partialweigiht)
                            shortestPath.set(index, elementtop);
                        break;
                    }
                    index++;
                }
                if (vertexisted == false)
                    shortestPath.add(elementtop);
            }

            for (edge edge : graph[elementtop.vertex - 65]) {
                traversal.add(new Dijkstra(edge.dest, elementtop.partialweigiht + edge.weight));
            }
        }

        for (Dijkstra d : shortestPath)
            if (d.partialweigiht != 0)
                System.out.println(d.vertex + " " + d.partialweigiht);
        checksze.close();
        edgchecker.close();
        in.close();
    }
}
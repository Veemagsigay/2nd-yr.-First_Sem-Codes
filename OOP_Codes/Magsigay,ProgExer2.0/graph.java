import java.util.*;
import java.io.*;

public class graph {
    
    private Map<String, List<String>> adjacentlist = new HashMap<>();
    private Map<String, Map<String, Integer>> incidentmap = new HashMap<>();
    private List<String> edges = new ArrayList<>();

    public void addvertices(String vertices){
        adjacentlist.putIfAbsent(vertices, new ArrayList<>());
        incidentmap.putIfAbsent(vertices, new HashMap<>());
    }

    public void addedges(String camefrom, String destination){
        adjacentlist.get(camefrom).add(destination);
        String edge = camefrom + "_" + destination;
        edges.add(edge);
        incidentmap.putIfAbsent(camefrom, new HashMap<> ());
        incidentmap.get(camefrom).put(edge,1);
    }

    public void usedreadinggraph(String filname){
        try {

           
            BufferedReader reads = new BufferedReader(new FileReader(filname));
            String line;

            while((line = reads.readLine()) != null){
                if(line.length() == 1){
                    addvertices(line);
                } else {
                    String[] checkvertice = line.split(" ");
                    addedges(checkvertice[0], checkvertice[1]); 
                }
            }
            reads.close();

        } catch(IOException e){}
    }

    public void dispplayadjacent(){
        System.out.print(" ");
        for(String vertex : adjacentlist.keySet()){
            System.out.printf("%-3s", vertex);
            for(String othervertex : adjacentlist.keySet()){
                System.out.printf("%3d", adjacentlist.get(vertex).contains(othervertex));
            }
            System.out.println();
        }
    }

    public void displayedges() {
        System.out.print(" ");

        for(String edge : edges) {
            System.out.printf("%-5s", edge);
        }
        System.out.println();

        for(String vertex : adjacentlist.keySet()){
            System.out.printf("%-5d",0);
            for(String edge: edges){
                if(edge.contains(vertex)){
                    System.out.printf("%-5d",1);
                } else {
                    System.out.printf("%-5d",0);
                }
            }
        }
    }

}

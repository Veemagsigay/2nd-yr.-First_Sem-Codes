import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.*;

public class MainApp {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        
        //BufferedReader files =  new BufferedReader("software.txt");
        boolean pick = true;

        while(pick){
            System.out.println("------------------------------------------------------");
            System.out.println("|       Welcome to Mary Vee's Software Store         |");
            System.out.println("|----------------------------------------------------|");
            System.out.println("|                                                    |");
            System.out.println("|  choose a letter you want to go                    |");
            System.out.println("|  1. Show Available Application                     |");
            System.out.println("|  2. Add Application                                |");
            System.out.println("|  3. Sell Application                               |");
            System.out.println("|  4. Exit Store                                     |");
            System.out.println("|                                                    |");
            System.out.println("|----------------------------------------------------|");

            System.out.println("Where do you want to go?");
            int choice = in.nextInt();

            switch(choice){
                case 1: showapp();
                case 2: addapp();
                case 3: sellapp();
                case 4: {
                    pick = false;
                    break; }

            }
        }

    }

    public static void showapp(){
        return;

    }

    public static void addapp(){
        
        BufferedWriter writeapp = new BufferedWriter("software.txt");
        
        
        System.out.println("What App so you want to Add?");
        String addapp = in.nextLine();
        in.nextLine();
        
        System.out.println("What version you want to add?");
        double appversion = in.nextDouble();
        
        System.out.println("How many you want to add?");
        int quantity = in.nextInt();

        System.out.println("What is the Price of that Application?");
        double price = in.nextDouble();
    }

    public static void sellapp(){

    }
}
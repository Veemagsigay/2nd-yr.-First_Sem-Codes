import java.util.Scanner;

public class Main {
    
    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);

        Rectangle rec = new Rectangle(in.nextDouble(), in.nextDouble());
        Square squ = new Square(in.nextDouble());
        Triangle tri = new Triangle(in.nextDouble(), in.nextDouble());
        Circle cir = new Circle(in.nextDouble());

        System.out.println(rec.toString());
        System.out.println(squ.toString());
        System.out.println(tri.toString());
        System.out.println(cir.toString());

        in.close();
    }

}

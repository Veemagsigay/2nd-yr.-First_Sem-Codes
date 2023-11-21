import java.util.*;

public class Main {
 
    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);
        Shape s = new Shape("Pink");
        getArea(s);
        System.out.println("--------------------------------- \n");
        s = new Rectangle("light Pink", 15,10);
        getArea(s);
        System.out.println("---------------------------------\n");
        s = new Triangle("Fuschia", 25, 30);
        getArea(s);

        
    }

    public static void getArea(Shape shape) {
        if(shape instanceof Rectangle){
            Rectangle rectangle = (Rectangle) shape;
            System.out.println(rectangle.toString());
        } else if (shape instanceof Triangle) {
            Triangle triangle = (Triangle) shape;
            System.out.println(triangle.toString());
        } else {
            System.out.println("Invalid Shape!");
        }
    }
}

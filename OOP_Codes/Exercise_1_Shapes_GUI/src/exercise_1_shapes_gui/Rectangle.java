
package exercise_1_shapes_gui;

public class Rectangle extends Shapes {

    public Rectangle(String color) {
        super(color);
    }

    private int length;
    private int width;

    public Rectangle (String color,int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    
    public String toString() {
        return "Area of Rectangle: " + getArea() + "\n" + "Color of the Triangle: " + super.getColor();
    }
 

    public int getArea() {
        return length * width;
    }
}

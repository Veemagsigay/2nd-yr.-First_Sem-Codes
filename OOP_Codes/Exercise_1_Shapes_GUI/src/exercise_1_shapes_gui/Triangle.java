
package exercise_1_shapes_gui;


public class Triangle extends Shapes {
    
    public Triangle(String color) {
        super(color);
    }

    private double base;
    private double height;

    public Triangle (String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    public String toString() {
        return "Area of Triangle: " + getArea() + "\n" + "Color of the Triangle: " + super.getColor();
    }

    public double getArea() {
        return 0.5 * base * height;
    }
    
}

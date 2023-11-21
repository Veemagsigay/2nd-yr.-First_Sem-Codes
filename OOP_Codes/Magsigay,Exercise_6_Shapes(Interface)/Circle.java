public class Circle implements GetArea{
    
    public double radius;
    public double finalPI = 3.14;
    
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return finalPI * (radius * radius);
    }

    public String toString() {
        return "Area of the circle is: " + getArea();
    }

    
}

public class Rectangle implements GetArea {
    
    public double length;
    public double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    public double getArea() {
        return length * width;
    }

    public String toString(){
        return "Area of the rectangle is: " + getArea();
    }

    
    


}

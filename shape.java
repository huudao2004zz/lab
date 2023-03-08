package lab4;

public abstract class shape {
    public abstract double getArea();
}
class Rectangle extends shape{
    private int length;
    private int width;
    public  Rectangle(int length, int width){
        this.length = length;
        this.width = width ;
    }
    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
    @Override
    public double getArea() {
        return length * width;
    }
}
class Triangle extends shape {
    private double base;
    private double height;
    public  Triangle(double base, double height){
        this.height = height;
        this.base = base;
    }
    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return (base * height)/2 ;
    }
}
   class testing{
       public static void main(String[] args) {
           Rectangle rectangle = new Rectangle(15,5);
           Triangle triangle = new Triangle(1.5,2);
           System.out.println("Reactangle : " +rectangle.getArea());
           System.out.println("Triangle : " +triangle.getArea());

       }
   }
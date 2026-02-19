package SOLID.ISP;

public class ISP {
    public static void main(String[] args) {
        Shape2d square = new Square(5);
        Shape2d rectangle = new Rectangle(5,5);
        Shape3d cube = new Cube(5);

        square.area();
        rectangle.area();
        cube.area();
        cube.volume();
    }
}

abstract class Shape2d {
    abstract public void area();
}

abstract class Shape3d {
    abstract public void area();
    abstract public void volume();
}

class Square extends Shape2d {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void area() {
        double area = side*side;
        System.out.println("Square area = " + area);
    }
}

class Rectangle extends Shape2d {
    private double l;
    private double b;

    public Rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }

    @Override
    public void area() {
        double area = l*b;
        System.out.println("Rectangle area = " + area);
    }
}

class Cube extends Shape3d {
    private double s;
    public Cube(double s) {
        this.s = s;
    }

    @Override
    public void area() {
        double area = 6 * s * s;
        System.out.println("Cube area = " + area);
    }

    @Override
    public void volume() {
        double volume = s*s*s;
        System.out.println("Cube volume = " + volume);
    }
}


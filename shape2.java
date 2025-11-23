abstract class Shape {
    abstract double area();
}

class Triangle extends Shape {
    double base, height;

    Triangle(double b, double h) {
        base = b;
        height = h;
    }

    double area() {
        return 0.5 * base * height;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    double area() {
        return length * width;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    double area() {
        return 3.14 * radius * radius;
    }
}

public class shape2{
    public static void main(String[] args) {
        Triangle t = new Triangle(10, 5);
        Rectangle r = new Rectangle(8, 4);
        Circle c = new Circle(7);

        System.out.println("Triangle Area: " + t.area());
        System.out.println("Rectangle Area: " + r.area());
        System.out.println("Circle Area: " + c.area());
    }
}

package JavaPOE;

class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }

    double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double area() {
        return length * breadth;
    }

    double perimeter() {
        return 2 * (length + breadth);
    }
}

class Square {
    double side;

    Square(double side) {
        this.side = side;
    }

    double area() {
        return side * side;
    }

    double perimeter() {
        return 4 * side;
    }
}

public class Shapes {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Rectangle r = new Rectangle(4, 6);
        Square s = new Square(3);

        System.out.println("Circle: Area = " + c.area() + ", Perimeter = " + c.perimeter());
        System.out.println("Rectangle: Area = " + r.area() + ", Perimeter = " + r.perimeter());
        System.out.println("Square: Area = " + s.area() + ", Perimeter = " + s.perimeter());
    }
}

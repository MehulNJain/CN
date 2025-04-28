class circle{
    double radius;

    circle(double r)
    {
        radius = r;
    }
    void calculate()
    {
        double area = 3.14*radius*radius;
        double perimeter = 2*3.14*radius;
        System.out.println("circle->area:"+area+",perimeter:"+perimeter);

    }
}
class rectangle{
    double length,breadth;
    rectangle(double l,double b)
    {
        length=l;
        breadth=b;


    }
    void calculate()
    {
        double area = length*breadth;
        double perimeter = 2*(length+breadth);
        System.out.println("Rectangle->area:"+area+",perimeter:"+perimeter);
    }
}
class square{
    double side;
    square(double s)
    {
        side = s;
    }
    void calculate()
    {
        double area = side*side;
        double perimeter = 4*side;
        System.out.println("square->area:"+area+",perimeter:"+perimeter);
    }
}

public class calculate {
    public static void main(String[] args){
        circle c = new circle(5);
        c.calculate();

        rectangle r= new rectangle(2,2);
        r.calculate();

        square s= new square(5);
        s.calculate();



    }
}

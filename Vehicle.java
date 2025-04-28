package JavaPOE;

class Automobile {
    void display() {
        System.out.println("This is an automobile.");
    }
}

class TwoWheeler extends Automobile {
    void show() {
        System.out.println("This is a 2-wheeler.");
    }
}

class FourWheeler extends Automobile {
    void show() {
        System.out.println("This is a 4-wheeler.");
    }
}

class Heavy extends Automobile {
    void show() {
        System.out.println("This is a heavy vehicle.");
    }
}

class FrontWheelDrive extends FourWheeler {
    void type() {
        System.out.println("This is a front-wheel drive vehicle.");
    }
}

class RearWheelDrive extends FourWheeler {
    void type() {
        System.out.println("This is a rear-wheel drive vehicle.");
    }
}

class AllWheelDrive extends FourWheeler {
    void type() {
        System.out.println("This is an all-wheel drive vehicle.");
    }
}

public class Vehicle {
    public static void main(String[] args) {
        TwoWheeler bike = new TwoWheeler();
        bike.display();
        bike.show();

        FrontWheelDrive car1 = new FrontWheelDrive();
        car1.display();
        car1.show();
        car1.type();

        RearWheelDrive car2 = new RearWheelDrive();
        car2.display();
        car2.show();
        car2.type();

        AllWheelDrive car3 = new AllWheelDrive();
        car3.display();
        car3.show();
        car3.type();

        Heavy truck = new Heavy();
        truck.display();
        truck.show();
    }
}

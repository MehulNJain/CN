package JavaPOE;

import java.util.Scanner;

class IP {
    void findClass() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter IP address: ");
        String ip = sc.nextLine();
        int firstOctet = Integer.parseInt(ip.split("\\.")[0]);

        if (firstOctet >= 1 && firstOctet <= 126)
            System.out.println("Class A");
        else if (firstOctet >= 128 && firstOctet <= 191)
            System.out.println("Class B");
        else if (firstOctet >= 192 && firstOctet <= 223)
            System.out.println("Class C");
        else if (firstOctet >= 224 && firstOctet <= 239)
            System.out.println("Class D");
        else if (firstOctet >= 240 && firstOctet <= 255)
            System.out.println("Class E");
        else
            System.out.println("Invalid IP");
    }
}

class Parent {
    int x = 10;
}

class Child extends Parent {
    int x = 20;

    void show() {
        System.out.println(this.x);
        System.out.println(super.x);
    }
}

class PalindromeCheck {
    void check() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String original = sc.nextLine();

        StringBuffer sb = new StringBuffer(original);
        String reversed = sb.reverse().toString();

        if (original.equals(reversed))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}

class Animal {}

class Dog extends Animal {}

class InstanceofDemo {
    void checkInstance() {
        Animal a = new Dog();

        if (a instanceof Dog)
            System.out.println("a is instance of Dog");

        if (a instanceof Animal)
            System.out.println("a is instance of Animal");
    }
}

public class Combined {
    public static void main(String[] args) {
        IP ip = new IP();
        ip.findClass();

        Child obj = new Child();
        obj.show();

        PalindromeCheck p = new PalindromeCheck();
        p.check();

        InstanceofDemo i = new InstanceofDemo();
        i.checkInstance();
    }
}

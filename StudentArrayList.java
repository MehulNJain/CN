package JavaPOE;

import java.util.*;
import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    String dob;
    String department;
    double percentage;

    public Student(int rollNo, String name, String dob, String department, double percentage) {
        this.rollNo = rollNo;
        this.name = name;
        this.dob = dob;
        this.department = department;
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return rollNo + " " + name + " " + dob + " " + department + " " + percentage;
    }
}

public class StudentArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter Roll Number: ");
            int rollNo = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Date of Birth (dd-mm-yyyy): ");
            String dob = scanner.nextLine();

            System.out.print("Enter Department: ");
            String department = scanner.nextLine();

            System.out.print("Enter Percentage: ");
            double percentage = scanner.nextDouble();
            scanner.nextLine();

            students.add(new Student(rollNo, name, dob, department, percentage));
        }

        students.sort(Comparator.comparingInt((Student s) -> s.rollNo).thenComparing(s -> s.department));

        System.out.println("\nSorted Student Records:");
        for (Student student : students) {
            System.out.println(student);
        }

        scanner.close();
    }
}

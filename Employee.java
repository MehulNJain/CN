package JavaPOE;

import java.util.*;

class Emp {
    int empId;
    String empName;
    String doj;
    String designation;
    double salary;

    public Emp(int empId, String empName, String doj, String designation, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.doj = doj;
        this.designation = designation;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return empId + " " + empName + " " + doj + " " + designation + " " + salary;
    }
}

public class Employee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Emp> employees = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter JavaPOE.Employee ID: ");
            int empId = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter JavaPOE.Employee Name: ");
            String empName = scanner.nextLine();

            System.out.print("Enter Date of Joining (dd-mm-yyyy): ");
            String doj = scanner.nextLine();

            System.out.print("Enter Designation: ");
            String designation = scanner.nextLine();

            System.out.print("Enter Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine();

            employees.add(new Emp(empId, empName, doj, designation, salary));
        }

        List<Emp> sortedList = new ArrayList<>(employees);
        sortedList.sort(Comparator.comparingDouble(e -> e.salary));

        System.out.println("\nSorted JavaPOE.Employee Records by Salary:");
        for (Emp emp : sortedList) {
            System.out.println(emp);
        }

        scanner.close();
    }
}

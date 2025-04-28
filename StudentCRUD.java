package JavaPOE;

import java.io.*;
import java.util.*;

class Student implements Serializable {
    int id;
    String name;
    double marks;

    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return id + " " + name + " " + marks;
    }
}

public class StudentCRUD {
    static final String FILE_NAME = "students.dat";

    public static void saveList(List<Student> list) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
        oos.writeObject(list);
        oos.close();
    }

    public static List<Student> loadList() throws IOException, ClassNotFoundException {
        File f = new File(FILE_NAME);
        if (!f.exists()) return new ArrayList<>();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME));
        List<Student> list = (List<Student>) ois.readObject();
        ois.close();
        return list;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.Add 2.View 3.Update 4.Delete 5.Exit");
            int choice = sc.nextInt();
            List<Student> list = loadList();
            if (choice == 1) {
                System.out.print("Enter id, name, marks: ");
                int id = sc.nextInt();
                String name = sc.next();
                double marks = sc.nextDouble();
                list.add(new Student(id, name, marks));
                saveList(list);
            } else if (choice == 2) {
                for (Student s : list) System.out.println(s);
            } else if (choice == 3) {
                System.out.print("Enter id to update: ");
                int id = sc.nextInt();
                boolean found = false;
                for (Student s : list) {
                    if (s.id == id) {
                        System.out.print("Enter new name and marks: ");
                        s.name = sc.next();
                        s.marks = sc.nextDouble();
                        found = true;
                        break;
                    }
                }
                if (found) saveList(list);
                else System.out.println("Student not found");
            } else if (choice == 4) {
                System.out.print("Enter id to delete: ");
                int id = sc.nextInt();
                list.removeIf(s -> s.id == id);
                saveList(list);
            } else if (choice == 5) {
                break;
            }
        }
    }
}

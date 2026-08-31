import java.io.*;
import java.util.*;

class Student {
    int rollno;
    String name;

    void accept() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter roll no: ");
        rollno = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter name: ");
        name = sc.nextLine();
    }

    void display() {
        System.out.println("Roll No: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("UpperCase: " + name.toUpperCase());
        System.out.println("LowerCase: " + name.toLowerCase());
        System.out.println("Length: " + name.length());
        System.out.println("Position of 'a': " + name.toLowerCase().indexOf('a'));
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.accept();
        s.display();
    }
}




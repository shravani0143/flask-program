import java.util.*;

class pro1
{
    int rollno;
    String name;

    void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter roll no: ");
        rollno = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name: ");
        name = sc.nextLine();
    }

    void display()
    {
        System.out.println("\nStudent details:");
        System.out.println("RollNo: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Uppercase name: " + name.toUpperCase());
        System.out.println("Lowercase name: " + name.toLowerCase());
        System.out.println("Length of name: " + name.length());

        int pos = name.indexOf('a');

        if (pos != -1)
            System.out.println("First occurrence of 'a': " + (pos + 1));
        else
            System.out.println("'a' not found in the name");
    }
    public static void main(String args[])
    {
        StudentDemo s = new StudentDemo();
        s.accept();
        s.display();
    }
}

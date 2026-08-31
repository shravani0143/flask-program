import java.util.*;

class Employee {
    int empId;
    String empName;

    void accept() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        empName = sc.nextLine();
    }

    void display() {
        System.out.println("ID: " + empId);
        System.out.println("NAME: " + empName);

        StringBuffer sb = new StringBuffer(empName);

        sb.append(" pvt.Ltd");
        System.out.println("Append: " + sb);

        sb.insert(0, "Mr./Ms. ");
        System.out.println("Insert: " + sb);

        sb.replace(7, 11, "Employee");
        System.out.println("Replace: " + sb);

        sb.reverse();
        System.out.println("Reverse: " + sb);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.accept();
        e.display();
    }
}



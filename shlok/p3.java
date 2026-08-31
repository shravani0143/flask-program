package Student;

public class StudentInfo {
    public int rollNo;
    public String name;
    public int m1, m2, m3;

    public void accept(int r, String n, int a, int b, int c) {
        rollNo = r;
        name = n;
        m1 = a;
        m2 = b;
        m3 = c;
    }
}
package Student;

public class StudentResult {

    public void display(StudentInfo s) {
        int total = s.m1 + s.m2 + s.m3;
        double percentage = total / 3.0;

        System.out.println("Roll No: " + s.rollNo);
        System.out.println("Name: " + s.name);
        System.out.println("Percentage: " + percentage + "%");
    }
}

import java.util.*;
import Student.*;
 class Student Main{
	 public static void main(String[] args){
		 scanner sc = new scanner (system.in);
		 int r= sc.nextInt();
		 system.out.println("Enter Name:");
		 string n= sc.next();
		 system.out.println("Enter 3 marks:");
		 int a = sc.nextInt();
		 int b = sc.nextInt();
		 int c = sc.nextInt();

		 StudentInfo s = new StudentInfo();
		 result.display(S);
	 }
 }



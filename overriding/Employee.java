import java.io.*;
import java.util.Scanner;
public class Employee
{
	public static void main(String args[])
	{
	        Manager m=new Manager(101,"Sneha","IT");
		m.display();
	}
}
 class Employee1
{
	int empid;
	String empName;
	Employee1(int empid,String empName)
	{
		this.empid=empid;
		this.empName=empName;
	}
	void display()
	{
		System.out.println("Employee ID:"+empid);
		System.out.println("Employe Name:"+empName);
	}
}
class Manager extends Employee1
{
	String department;
	Manager(int empid,String empName,String department)
	{
		super(empid,empName);
		this.department=department;
	}
	void display()
	{
		System.out.println("Manager ID:"+empid);
		System.out.println("Manager Name:"+empName);
		System.out.println("Department:"+department);
	}
}


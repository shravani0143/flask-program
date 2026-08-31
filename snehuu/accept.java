import java.io.*;
import java.util.Scanner;
class accept 
{
      int empID;
      String empName;
      String companyName;
void acc()
{
	Scanner sc=new Scanner(System.in);

	System.out.println("Enter Employee ID:");
	empID=sc.nextInt();

	sc.nextLine();

	System.out.println("Enter Employee Name:");
	empName=sc.nextLine();

        System.out.println("Enter Company  Name:");
	companyName=sc.nextLine();
}
void dis()
{
	System.out.println("\n Employee ID:"+empID);
	System.out.println("\n Employee Name:"+empName);
	System.out.println("\n Company Name:"+ companyName);

	StringBuffer company=new StringBuffer(companyName);
	StringBuffer name=new StringBuffer(empName);

	company.append("pvt.ltd.");

	name.insert(0,"Mr./Ms.");

	System.out.println("after Replace:"+company);
	company.reverse();

	System.out.println("After Reverse:"+company);
}
public static void main(String[] args)
{	accept e=new accept();
	e.acc();
	e.dis();
}
}



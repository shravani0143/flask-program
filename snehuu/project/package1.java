import java.util.Scanner;
import Student.*;
import Student.*;

class package1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		studentinfo s=new studentinfo();
		studentResult r=new studentResult();

		System.out.println("Enter Roll No:");
		int roll=sc.nextInt();

		sc.nextLine();

		System.out.println("Enter Name:");

		String name=sc.nextLine();

		System.out.println("Enter Marks of Subject1:");
		int m1=sc.nextInt();

		System.out.println("Enter Marks of Subject2:");
		int m2=sc.nextInt();

		System.out.println("Enetr Marks of Subject3:");
		int m3=sc.nextInt();

		s.accept(roll,name);
		r.calculatePercentage(m1,m2,m3);

		System.out.println("\n ---Student Details---");
		s.display();
	//.displayResult(m1,m2,m3);
	}
}


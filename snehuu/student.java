import java.util.Scanner;

class student
{
	int rollno;
	String name;

	void accept()
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter Roll No:");
		rollno=sc.nextInt();

		sc.nextLine();
		System.out.println("Enter Name:");
		name=sc.nextLine();
	}
	void display()
	{
		System.out.println("\n ROll No:"+rollno);
		System.out.println("Name:"+name);
		System.out.println("Uppercase:"+name.toUpperCase());
		System.out.println("Lowercase:"+name.toLowerCase());
		System.out.println("Length:"+name.length());

	     System.out.println("first occurrence of '0':"+name.indexOf('a'));
          }
	public static void main(String[] args)
	{
		student s=new student();
		s.accept();
		s.display();
	}
}







import java.util.Scanner;
class student
{
	int rollno;
	String name;

	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter roll no:");
		rollno=sc.nextInt();
		sc.nextLine();
		System.out.print("enter name:");
		name=sc.nextLine();
	}
	void display()
	{
		System.out.println("\n student details:");
		System.out.println("RollNo:" +rollno);
		System.out.println("Name:"+name);
		System.out.println("Uppercase name:" +name.toUpperCase());
		System.out.println("Lowercase Name:" +name.toLowerCase());
		System.out.println("length of Name:" +name.length());

		int pos=name.indexOf('a');
			if(pos !=-1)
				System.out.println("first occurence of 'a':" +(pos+1));
			else
				System.out.println("'a' not found in the name");
	}
class studentDemo
{
	public static void main(String args[])
        {
                Student s=new Student();
                s.accept();
                s.display();
        }
}
}

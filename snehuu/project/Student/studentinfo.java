package Student;

public class studentinfo
{
	public int rollno;
	public String name;

	public void accept(int r,String n)
	{
		rollno=r;
		name=n;
	}
	public void display()
	{
		System.out.println("Roll No:"+rollno);
		System.out.println("Name:"+name);
	}
}


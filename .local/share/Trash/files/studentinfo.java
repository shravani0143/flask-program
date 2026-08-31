package student;
public class StudentInfo{
	public int rollno;
	public String name;
	public int m1,m2,m3;
	public void accept(int rollno, String name,int m1,int m2,int m3)
	{
		this.rollno=rollno;
		this.name=name;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	public void display()
	{
		System.out.println("roll no:\t"+rollno);
		System.out.println("Name:\t"+name);
		System.out.println("Marks:\t"+m1+","+m2+","+m3);
	
	}
}

import java.util.Scanner;
class Student {
	private int rollNo;
	private String name;
	private float percentage;
	Student() {
		this(0,"unknown",0.0f);
	}
	Student(int rollNo, String name,float percentage) {
		this.rollNo=rollNo;
		this.name=name;
		this.percentage=percentage;
	}
	void display() {
		printStudent(this);
	}
	void printStudent(Student s){
		System.out.println("percentage:"+s.percentage);
		System.out.println("rollNo:"+s.rollNo);
	}
}
public class display {
	public static void main(String[] args) {
		Student s1=new Student(101,"Priya",85.5f);
		s1.display();
		Student s2=new Student();
		s2.display();
	}
}



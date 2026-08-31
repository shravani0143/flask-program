import java.util.Scanner;
class Student{
	int rollNumber;
	String name;
	double percentage;
	void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Roll Number:");
		rollNumber=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter name:");
		name=sc.nextLine();
		System.out.print("Enter percentage:");
		percentage=sc.nextDouble();
	}
	void display(){
		System.out.println("Roll Number:"+rollNumber);
		System.out.println("Name:"+name);
		System.out.println("Percentage:"+percentage);
		System.out.println();
	}
}
public class array {
	public static void main(String[] args) {
			Student[] s=new Student[5];
			for(int i=0;i<5;i++) {
				s[i]=new Student();
				System.out.println("\n Enter details of Student"+(i+1));
				s[i].accept();
			}
			System.out.println("\n Student Records");
			for(int i=0;i<5;i++) {
				s[i].display();
			}
		}
}

import java.util.*; 

class emplyee
{
	int empId;
	string empName;
	void accept()
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter Employee ID:");
		empId = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Employee Name:");
		sc.nextLine();
	}
	void display()
	{
		System.out.println("\n Emplyee ID:" +empId);
		System.out.println("Employee Name:" + empName);
		StringBuffer sb=new StringBuffer(empName);

	sb.append("Pvt,Ltd:");
	Systen.out.println("Append:" +sb);
	
	sb.insert(0,"Mr./Ms.");
	System.out.println("Insert:" +sb);

	sb.replace(0,7 "Dr.");
	System.out.println("Replace:" +sb);

	sb.reverse();
	System.out.println("Reverse: " +sb);
       
        public static void main (String args[]));
{
        Employee e=new employee();
        e.accept();
        e.display();
}
}
}

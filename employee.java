import java.io.*;
import java.util.*;
class employee
{
	int empid;
	string name;
	void display(int id,string n)
	{
		emp id=id;
		name=n;
		System.out.println("Employee ID: "+emp id);
		System.out.println("Employee Name: "+name);
	}
}
class manager extends employee
{
	double salary;
	void showSalary(double s)
	{
		salary=s;
		System.out.println(salary:"+salary);
	}
}


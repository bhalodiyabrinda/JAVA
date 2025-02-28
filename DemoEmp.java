import java.util.*;
class Employee
{
	private int eid;
	String name;
	double salary;

	Employee()   // consrructor
	{
		//eid=123;
		//name="abcd";
		//salary=20000;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Employee eid:");
		eid = sc.nextInt();

		System.out.println("Enter Employee name:");
		name = sc.next();

		System.out.println("Enter Employee salary:");
		salary = sc.nextDouble();
	}	

	void showData()  //method
	{
		System.out.println("Employee id:"+eid);
		System.out.println("Employee name:"+name);
		System.out.println("Employee salary:"+salary);
	}
	void testData()
	{
		showData();  //calling of private method
	}
}


public class DemoEmp
{
	public static void main(String args[])
	{
		Employee e1 = new Employee();
		System.out.println("Fist Employee information");
		e1.showData();

		Employee e2 = new Employee();
		System.out.println("Second Employee information");
		e2.showData();

		Employee e3 = new Employee();
		e3.testData();
	}
}
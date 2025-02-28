import java.util.*;

class Person	//super class
{
	private String name;
	protected int age;
	char gender;

	void getPerson()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Person name:");
		name = sc.next();

		System.out.println("Enter Person age:");
		age = sc.nextInt();
		
		System.out.println("Enter Person gender:");
		gender = sc.next().charAt(0);
	}
	
	void showPerson()
	{
		System.out.print("Person name: "+name );
		System.out.print("Person age: "+age );
		System.out.print("Person gender: "+gender );
	}
}
class Employee extends Person	//sub class
{
	int eid;
	int salary;

	void getEmp()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Employee eid:");
		eid = sc.nextInt();

		System.out.println("Enter Employee salary:");
		salary = sc.nextInt();
	}

	void showEmp()
	{
		System.out.print("Employee eid: "+eid );
		System.out.print("Employee salary: "+salary );
	}
}
public class DemoInh
{
	public static void main (String args[])
	{
		Employee e1 = new Employee();

		e1.getPerson();

		e1.getEmp();

		e1.showPerson();

		e1.showEmp();	
	}
}
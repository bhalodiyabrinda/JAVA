class Person	//super class
{
	private String name;
	int age;
	char gender;

	void getPerson(String name, int age, char gender)
	{
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	
	void showPerson()
	{
		System.out.print("Person name: "+name );
		System.out.print("Person age: "+age );
		System.out.print("Person gender: "+gender );
	}
}

class Studend extends Person	//sub class
{
	int roll;
	String branch;

	void getStu(int roll,String branch)
	{
		this.roll=roll;
		this.branch=branch;
	}

	void showStu()
	{
		System.out.print("Employee eid: "+roll );
		System.out.print("Employee salary: "+branch );
	}
}


class Employee extends Person	//sub class
{
	int eid;
	int salary;

	void getEmp(int eid,int salary)
	{
		this.eid=eid;
		this.salary=salary;
	}

	void showEmp()
	{
		System.out.print("Employee eid: "+eid );
		System.out.print("Employee salary: "+salary );
	}
}
public class DemoInh_
{
	public static void main (String args[])
	{
		Employee e1 = new Employee();

		e1.getPerson("AAA",22,'f');
		e1.getEmp(101,12000);
		System.out.println("Employee information:");

		e1.showPerson();
		e1.showEmp();

		Student	s1 = new Studend();
		s1.getPerson("BBB",25,'f');
		s1.getStu(11,"ce");
		System.out.println("Student information:");
		s1.showPerson();
		s1.showStu();

	}
}
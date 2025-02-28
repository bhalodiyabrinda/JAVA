//multilevel inheritance

class Person
{
	String name;
	int age;

	void setPerson(String name, int age)
	{
		this.name=name;
		this.age=age;
	}	
	void showPerson()
	{
		System.out.println("Name of Person:"+name);
		System.out.println("Age of Person:"+age);
	}
}

class Employee extends Person
{
	int eid;
	double salary;
	
	void setEmployee(int eid,double salary)
	{
		this.eid=eid;
		this.salary=salary;
	}
	void showEmployee()
	{
		System.out.println("Employee eid:"+eid);
		System.out.println("Employee salary:"+salary);
	}
}

class Teacher extends Employee
{
	String dept;
	int exp;

	void setTeacher(String dept,int exp)
	{
		this.dept=dept;
		this.exp=exp;
	}
	void showTeacher()
	{
		System.out.println("Teacher department:"+dept);
		System.out.println("Teacher experience:"+exp);
	}
}

public class DemoMlevel
{
	public static void main(String args[])
	{	
		Teacher t1 = new Teacher();
		t1.setPerson("aaa",25);
		t1.setEmployee(101,12345);
		t1.setTeacher("ce",3);
		t1.showPerson();
		t1.showEmployee();
		t1.showTeacher();
	}
}
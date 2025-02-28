//multilevel inheritance

class Person
{
	private String name;
	private int age;

	void setPerson(String name,int age)
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
	private int eid;
	private double basic;
	private double hra;
	
	void setEmployee(int eid, double basic, double hra)
	{
		this.eid=eid;
		this.basic=basic;
		this.hra=hra;
	}

	double getBasic()
	{
		return basic;
	}

	double getHra()
	{
		return hra;
	}

	void showEmployee()
	{
		System.out.println("Employee eid:"+eid);
		System.out.println("Employee basic salary:"+basic);
		System.out.println("Employee HRA:"+hra);
	}
}

class Teacher extends Employee
{
	private String dept;
	private double da;
	private double salary;

	void setTeacher(String dept, double da, double salary)
	{
		this.dept=dept;
		this.da=da;
		this.salary=salary;
	}

	void showTeacher()
	{
		System.out.println("Teacher department:"+dept);
		System.out.println("Teacher da:"+da);
		System.out.println("Teacher salary:"+salary);
	}

	void calcSalary()
	{
		salary=getBasic()+getHra()+da;
		System.out.println("salary:"+salary);
	}
}

public class DemoM1
{
	public static void main(String args[])
	{	
		Teacher t1 = new Teacher();
		t1.setPerson("aaa",25);
		t1.setEmployee(101,12.56,78.0);
		t1.setTeacher("ce",3.32,12.23);
		t1.showPerson();
		t1.showEmployee();
		t1.showTeacher();
		t1.calcSalary();
	}
}
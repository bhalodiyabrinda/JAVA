/* this(): to invoke constructor of the same class make a chain of one object crertion,

this() must be fist statement in constructor definition

public void myMethod(this)

we can pass this keyword as an argument ot method where it is requird to pass reference of current class as an argument
*/

class Student
{
	int roll;
	String name;
	double cgpa;
		
	Student()   //default const
	{
		System.out.println("Default const called:");
	}

	Student(int roll)
	{
		this();
		this.roll=roll;
	}

	Student(String name, double cgpa)
	{
		this.name=name;
		this.cgpa=cgpa;
	}

	private void show()
	{
	
		System.out.println("Roll no of student:"+roll);
		System.out.println("Name no of student:"+name);
		System.out.println("CGPA no of student:"+cgpa);
	}

	public void temp()
	{
		this.show();
	}
}
public class StDemo
{
	public static void main(String args[])

	{
		Student s1 = new Student(23,"qwe",12.1);
        System.out.println("Student 1 Details:");
        s1.temp();
	}
}

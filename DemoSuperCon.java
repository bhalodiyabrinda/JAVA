/*
super constructor
*/
class A
{
	int a;
	A(int a)
	{
		System.out.println("constructor from A");
		this.a=a;
	}
}
class B extends A
{
	int b;
	B(int a, int b)
	{
		super(a);
		System.out.println("constructor from B");
		this.b=b;
	}
}
class C extends B
{	
	C(int a, int b)
	{
		super(a,b);
		System.out.println("constructor from C");
	}
	void show()
	{
	 	System.out.println("Addition:"+(a+b));
	}
}
	
public class DemoSuperCon
{
	public static void main (String args[])
	{
		C ob1 = new C(1,2);
		ob1.show();
	} 
}




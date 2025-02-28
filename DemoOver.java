/*
super keyword is used to call immediate super class 
methods which is being overriden
*/
class A
{
	void show()
	{
		System.out.println("Method from A");
	}
}
class B extends A
{
	void show()
	{
		System.out.println("Method from B");
	}
}
public class DemoOver
{
	public static void main (String args[])
	{
		B ob1 = new B();
		ob1.show();
		A ob2 = new A();
		ob2.show();
	} 
}




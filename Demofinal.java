//final(key word) method

class A
{
	final int x=10;
	final void showA()
	{
		System.out.println("X is :"+x);
	}
}
class B extends A
{
	final void showB()
	{
		System.out.println("X is from B :"+x);
	}
}
public class Demofinal
{
	public static void main(String args[])
	{
		A ob1 = new B();
		B ob2 = new B();
		ob1.showA();
		ob2.showB();
	}
}
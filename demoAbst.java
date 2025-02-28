//Abstract method 
/*
Abstract class provaid partial Abstraction in java while interface provaids fully
Abstraction
*/
abstract class A
{
	A()
	{
		System.out.println("Const from Abstract class");

	}
	void showT()
	{
		System.out.println("Non-Abstract method from Abstract class");
	}
	abstract void showA();
}
class B extends A
{
	void showA()
	{
		System.out.println("Overridden of Abstraction method");
	}
}
public class demoAbst
{
	public static void main(String args[])
	{
		B ob = new B();
		ob.showA();
		ob.showT();
	}
}
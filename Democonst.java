//super constructors in inheritance

class A
{
	int a;
	A(int a)
	{
		System.out.println("Default const of super classA");
		this.a=a;

	}
}
class B extends A
{
	int b;
	B(int a, int b)
	{
		super(a);
		System.out.println("Default const of sub class B");
		this.b=b;
		System.out.println("From B:"+b);
	}
}
class C extends B
{
	int c;
	C(int a, int b, int c)
	{
		super(a,b);
		System.out.println("const of final sub class C");
		this.c=c;
		System.out.println("From C:"+c);
	}
}
public class Democonst
{
	public static void main(String args[])
	{
		C obj = new C(10,20,30);
	}
}
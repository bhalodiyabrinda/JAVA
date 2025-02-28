//this constructor
class Test
{
	int a;
	int b;
	int c;
	Test(int a)
	{
		this.a=a;
	}
	Test(int a, int b, int c)
	{
		this(a);
		this.b=b;
		this.c=c;
	}
	void show()
	{
		System.out.println("Addition:"+(a+b+c));
	}
}
public class DemoThis
{
	public static void main(String args[])
	{
		Test t = new Test(5,10,15);
		t.show();
	}
	
}
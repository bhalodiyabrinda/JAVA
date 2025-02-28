//Interface

interface A
{
	public final int x=10;
	public abstract void showA();
}
interface B
{
	int y=20;
	void showB();
}
class C implements A,B
{
	public void showA()
	{
		System.out.println("X from interface is:"+x);
	}
	public void showB()
	{
		System.out.println("Y from interface is:"+y);
	}
}
public class DemoInterface
{
	public static void main(String args[])
	{
		C ob = new C();
		ob.showA();
		ob.showB();
	}
}
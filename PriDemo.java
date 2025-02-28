// how to access private data member outside the class

class PriMem
{
	private int a;
	public int getA(int b) //access using public method 
	{
		return a=b;
	}
}
class PriDemo
{
	public static void main (String s[])
	{
		PriMem p = new PriMem();
		System.out.println("acces private member a:"+p.getA(12));
	}
}
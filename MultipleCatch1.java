//Multiple Catch block

public class  MultipleCatch1
{
	public static void main (String args[])
	{
		try
		{
			int a[]=new int[5];
			a[5]=300;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception occurs");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		
	}
}
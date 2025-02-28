//Exception with Try-Catch block
//import java.util.*;
public class Exception1 
{
	public static void main (String args[])
	{
		try
		{
			int a=100;
			//Scanner sc = new Scanner(System.in);

			//System.out.println("Enter value A ");
			//int a = sc.nextInt();

			//System.out.println("Enter value B ");
			//int b = sc.nextInt();
		}
		catch(ArithmeticException a)
		{
			System.out.println(a);
		}
		finally
		{
			System.out.println("Always executed");
	
		}
	}
}
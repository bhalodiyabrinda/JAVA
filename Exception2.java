//Exception with Try-Catch block
import java.util.*;
public class Exception2 
{
	public static void main (String args[])
	{
		try
		{
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter value A ");
			int a = sc.nextInt();

			System.out.println("Enter value B ");
			int b = sc.nextInt();
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Always executed");
	
		}
	}
}
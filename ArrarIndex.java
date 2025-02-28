//how to hander Array index out of bounds exception using class?

public class ArrarIndex  
{
	public static void main (String args[])
	{
		try
		{
			int array[]={1,2,3,4};
			System.out.println(array[10]); //may throw exception
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(" "+e);
		}
	}
}
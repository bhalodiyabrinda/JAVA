//NullPointerException: String s=null;

public class NullPointer
{
	public static void main (String s1[])
	{
		try
		{	
			String s= null;
			System.out.println("len"+s.length());
		}
		catch(NullPointerException e)
		{	
			System.out.println(e);
		}
		finally
		{
			System.out.println("Always finally bolck executed");

		}
	}
}
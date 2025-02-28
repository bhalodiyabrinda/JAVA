//throw and throws exception in method

class ThrowEx2
{
	static void demo()throws ArithmeticException
	{
		throw new ArithmeticException("Demo of throws");
	}

	public static void main (String args[])
	{
		try
		{	
			demo();  //calling method
		}
		catch(ArithmeticException E)
		{
			System.out.println("Exception Caught");
			System.out.println(E.getMessage());
		}
	}
}
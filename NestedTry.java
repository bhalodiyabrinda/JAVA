/*
nested try block


try   //outer try block
{
	try   //inner try block1
	{	
	
	}
	catch(Exception object)
	{
	
	}
	try   //inner try block2
	{	
	
	}
	catch(Exception object)
	{
	
	}
}
catch(Exception object) //catch block for outer try block
{
	
}
*/
class NestedTry
{
	public static void main(String args[])
	{
		try
		{
			try
			{
				int a=100/0;
				System.out.println(a);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Arithmetic:"+e);
			}
			try
			{
				int arr[]={1,2,3};
				System.out.println("Array"+arr[10]);
			}
			catch(ArrayIndexOutOfBoundException e)
			{
				System.out.println("Array:"+e);
			}
			try
			{
				String s1=null;
				System.out.println("String length:"+s1.length());
			}
			catch(NullpointerException n)
			{
				System.out.println("Nullpointer:"+n);

			}
		}
		catch(Exception e)
			{
			}
	}
}








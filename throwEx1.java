/*
how to throw and throws built exception or user define exception?

1.throw:-
-->Used to throw an exception for in class and method
-->Syntex
	throw is followed by an object(new type)
	used inside the method and class

2.throws:-
-->Used to indicate what exception mwy be throwes by method
-->Syntex
*/

class throwEx1
{
	public static void main(String args[])
	{
		try
		{
			throw new NullPointerException();
		}
		catch(NullPointerException n)
		{
			System.out.println("null pointer exception occured"+n);
		}
	}
}	
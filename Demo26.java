/*
Enumeration:~
	    An enum type is a sprcial data type that enables for a varible to be a set of proedrfined constent. The variable must be rqual to one the vaiues that have been predefined for it.

Common example include compass directions (values of NORTH,SOUTH,EAST and WEST)
*/

public class Demo26
{
	enum Level{
		LOW,
		MEDIUM,
		HIGH
	}
	public static void main (String args[])
	{
		Level myVar=Level.MEDIUM;
		System.out.println(myVar);
	}
}

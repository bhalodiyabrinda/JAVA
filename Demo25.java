/*
command line arguments:(String a[])
*/

class Demo25
{
	public static void main(String s[])
	{
		System.out.print("s[0]:"+s[0]);
		System.out.print("s[1]:"+s[1]);

		for (int i=0; i<s.length; i++)
		{
			System.out.print("s["+i+"]:"+s[i]);
		}
	}
}
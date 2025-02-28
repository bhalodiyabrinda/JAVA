/*
string manipulation method
1.charAt()
2.length method
*/

public class charAtDemo29
{
	public static void main(String args[])
	{
		String s="ABCD/nEFGH";
		char c;
		System.out.println("s=");
		System.out.println(s);
		c=s.charAt(0);
		System.out.println("charAt()="+c);
		c=s.charAt(5);
		System.out.println("charAt(5)="+c);
		c=s.charAt(1);
		System.out.println("charAt(5)="+1);
		System.out.println("the length of this string is:");
		System.out.println(s.length()+"character");
	}
}
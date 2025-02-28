/*
startsWith()-->starting part - Prefix
EndsWith()-->ending part - suffix

*/
class TrimDemo33
{
	public static void main(String s[])
	{
		String s1=" Computer Engineering ";
		String prefix="Computer";
		String suffix="ing";
		System.out.println(""+s1+"\" has:"+prefix);
		System.out.print("as a prefix:\t");
		System.out.println(s1.startsWith(prefix)+".");//FALSE
		System.out.println("\""+s1+"\"  has :\""+suffix);
		System.out.print("as a suffix:\t");
		System.out.print(s1.endsWith(suffix)+".");//FALSE
		String s2=s1.trim(); //removing all white spacing
		System.out.println(""+s2+"\"  has :\""+prefix);
		System.out.print("as a prefix:\t");
		System.out.println(s2.startsWith(prefix)+".");//TRUE
		System.out.println(""+s2+"\"  has :\""+suffix);
		System.out.println("as a suffix:\t");
		System.out.println(s2.endsWith(suffix)+".");//TRUE
	}
}
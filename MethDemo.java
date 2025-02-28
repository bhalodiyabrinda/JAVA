/*
what is the disadvantis of method overloading????
method overloading : mrthod name same, but return type different and also number of agument different
*/

class MethOver
{
	int add (int a,int b)
	{ return a+b; }
	int add (int a,int b, int c)
	{ return a+b+c; }
	double add (double a,double b)
	{ return a+b; }
}
public class MethDemo
{
	public static void main(String s[])
	{
		MethOver m=new MethOver();
		System.out.println("add tow argument:"+m.add(10,20));
		System.out.println("add three argument:"+m.add(10,20,30));
		System.out.println("add tow argument:"+m.add(10.2,20.3));
	}
}
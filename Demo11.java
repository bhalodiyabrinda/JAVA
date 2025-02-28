/*
type casting:
1.automati, widening, implcit
	byte-->short->long->double

2.manal,explicit,narrowing
	int->flot,double->long.int-> byte
*/

class Demo11
{
	public static void main(String args[])
	{
		int a=10;
		float f=a;	//implicit convesion
		System.out.println("int a variable value:"+a);
		System.out.println("float f variable value:"+f);
		double d=2.3434;
		long l=(long)d;	//explicit convesion
		System.out.println("double -> long"+l);
		float f2=10.23f;
		int i =(int)f2;	//explicit convesion
		System.out.println("float->int:"+f2);
		char c=23;
		int i3=(int)c;
		System.out.println("char->int"+i3);
		System.out.println("char:"+c);
	}
}


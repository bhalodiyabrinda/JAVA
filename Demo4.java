/*
data type :------
1. numerical bit data
	 long : 64 bit data
	 int : 32 bit data
	 short : 16 bit data
	 byte : 8 bit data
*/ 

class Demo4
{	
	public static void main(String args[])
	{
		//print value of declare value
  		long a = 10000;
		int b = 20;
		short c = 3;
		byte d = 10;
		System.out.println("Long variable value:"+a);
		System.out.println("Intrger variable value:"+b);
		System.out.println("Short variable value:"+c);
		System.out.println("Byte variable value:"+d);

		//another way to print variable value	
		System.out.println("Long variable value:"+a+ "\n Intrger variable value:"+b+ 
		"\n Short variable value:"+c+ "\n Byte variable value:"+d);
	}
}
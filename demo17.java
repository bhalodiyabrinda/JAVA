/*
2.do while

do
{
	//body
}while (condition);
*/

class Demo17
{
	public static void main (String args[])
	{
		int n=10;
		do
		{
			System.out.println("tick:"+n);
			n--;
		}while(n>0);	
		
		int m=1;
		do
		{
			System.out.println("tick:"+m);
			m++;
		}while(m<=10);	
		
	}
}

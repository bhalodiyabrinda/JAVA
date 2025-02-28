/*
conditional
1. if
2. if else
3. nested if else
4. if....else  if....else
5. swith case
*/

import java.util.*;
class Demo12
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value a:");		
		int a=sc.nextInt();
		System.out.println("enter the value b:");
		int b=sc.nextInt();

		if(a>b)		//<,>,<=,>=,==,!=
		{
			System.out.println("a is greter than b");		
		}		
		if(a<b)
		{
			System.out.println("a is less than b");		
		}
		else
		{
			System.out.println("b is less than a");		
		}
	}
}		
/*
nested if..else
*/
import java.util.*;
class Demo13
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value a:");		
		int a=sc.nextInt();
		System.out.println("enter the value b:");
		int b=sc.nextInt();
		System.out.println("enter the value c:");
		int c=sc.nextInt();

		if((a==b)&&(a==c))
		{
			System.out.println("All Three are Equal");
		}
		if(a==b)
		{
			System.out.println("a and b both same");
			if(a>c)
			{
				System.out.println("c lass than a and b");
			}
			else
			{
				System.out.println("c greater than a and b");
			}
		}
		if(a==c)
		{
			System.out.println("a and c both same");
			if(a>c)
			{
				System.out.println("b lass than a and b");
			}
			else
			{
				System.out.println("b greater than a and b");
			}
		}
		if(b==c)
		{
			System.out.println("b and c both same");
			if(a>c)
			{
				System.out.println("a lass than a and b");
			}
			else
			{
				System.out.println("a greater than a and b");
			}
		}
		if(a>b)
		{
			System.out.println("a greater than b");
			if(a>c)
			{
				System.out.println("a greater than c");
			}
			else
			{
				System.out.println("a lass than c");
			}
		}
		else
		{
			System.out.println("a lass than b");
			if(b>c)
			{
				System.out.println("b greater than c");
			}
			else
			{
				System.out.println("b lass than c");
			}
		}
	}
}
import java.util.*;
class Demo15
{
	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("enter num1:");
		int num1=sc.nextInt();

		System.out.println("enter num2:");
		int num2=sc.nextInt();

		System.out.println("enter the given:+,-,/,*");
		char op=sc.next().charAt(0);
	
		switch(op)
		{		
			case '+':
				System.out.println("num1+num2:"+(num1+num2));
				break;

			case '-':
				System.out.println("num1-num2:"+(num1-num2));
				break;
	
			case '*':
				System.out.println("num1*num2:"+(num1*num2));
				break;

			case '/':
				System.out.println("num1/+num2:"+(num1/num2));
				break;

			default:
				System.out.println("Invalid choice");
		}	
	}
}

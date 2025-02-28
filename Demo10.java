import java.util.*;
class Demo10
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		float r;
		System.out.print("Enter value of r:");
		r= sc.nextFloat();

		float pai=3.14f;
		System.out.print("value of float:"+pai);
		
		float a =(r*r);
		float b = (a*pai);

		System.out.print("Area of Circle:"+b);	
	}
}
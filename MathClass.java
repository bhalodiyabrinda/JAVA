//math package

import java.lang.Math;
public class MathClass
{
	public static void main (String args[])
	{
		double x = 28;
		double y = 4;
		double a = Math.random();
		double b = Math.random()*25;

		System.out.println("Maximum number of x and y is: "+ Math.max(x,y));

		System.out.println("Minmum number of x and y is: "+ Math.min(x,y));

		System.out.println("Square root of y is :" + Math.pow(x,y));

		System.out.println("Absolute values of (-9999.555d)=" +Math.abs(9999.555));

		System.out.println("Randon number a:"+a);
		System.out.println("Randon number b:"+b);
		double c = 124.567;
		System.out.println("Randon number:" + Math.round(c));
	}
}
/*
more than one method with the same name but different argument list within a same class ===> method overloding
*/

class Test
{
	int a;
	int b;
	int c;
	void inputData(int n1)
	{
		a=n1;
	}
	void inputData(int n1, int n2)
	{
		b=n1;
		c=n2;		
	}
	void showData()
	{
		System.out.println(a+" "+b+" "+c);
	}
}
public class DemoTest
{
	public static void main(String args[])
	{
		Test obj = new Test();
		obj.inputData(10);
	//above stmt called inputData() having one int arg

		obj.inputData(20,30);
	//above stmt called inputData() having tow int arg

		obj.showData();
	}
}




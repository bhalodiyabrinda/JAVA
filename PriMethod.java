/*
how to access private method to another class

constructor return type don't
int add(int a ,int b)
int add(int a ,int b ,int c)
double add(double a ,double b)
*/

class PriMeth
{
	private void display()
	{
		System.out.println("Prvate method");
	}
	public int getSem(int sem)
	{
		display();  //call private method
		return sem;
	}
}
class PriMethod 
{
	public static void main(String s[])
	{
		PriMeth m = new PriMeth();
		System.out.println("Access private method:"+m.getSem(3)); 
	}
}
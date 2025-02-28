/*
consteuctor overloading
*/

class Rect 
{
	double len,wid;
	Rect()
	{
		len=10.2;
		wid=2.3;
	}
	Rect(double l1, double w1)
	{
		len=l1;
		wid=w1;
	}
	Rect(float l2, float w2)
	{
		len=l2;
		wid=w2;
	}
	/*
	Rect(double l3, double w3)
	{
		len=l3;
		wid=w3;
	}	
	*/
}
class ConOver
{
	public static void main(String s[])
	{
		Rect r= new Rect();
		System.out.println("Default constor len:"+r.len);
		Rect r1= new Rect(56.5,3.4);
		System.out.println("Default constor len:"+r1.len);
		Rect r2= new Rect(5f,3.4f);
		System.out.println("Default constor len:"+r2.len);
	}
}

/* this keyword */ 

class Rect
{
	double len,wid;
	Rect(double len,double wid)
	{
		this.len=len;
		this.wid=wid;

		//len=len;
		//wid=wid;
	}
}
class ThisDemo
{
	public static void main(String s[])
	{
		Rect r = new Rect(12.34,45.78);
		System.out.println("len:"+r.len);
		System.out.println("wid:"+r.wid);
	}
}
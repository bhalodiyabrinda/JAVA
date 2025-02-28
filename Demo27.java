public class Demo27
{
	enum Season{
		Winter,
		Summer,
		Spring
	}
	public static void main (String a[])
	{
		//access value using for loop
		for (Season s:Season.values())
		{
			System.out.println(s);
		}
		//access index
		System.out.print("Winter index:" +Season.valueOf("Winter").ordinal());
	}
}
public class Demo28
{
	enum Week{
		Sunday,
		Monday,
		Tuesday,
		Wendnesday,
		Thrusday,
		Friday,
		Saturday
	}
	enum Month{
		January,
		February,
		March,
		April,
		May,
		June,
		July,
		August,
		September,
		October,
		November,
		December
	}
	public static void main (String a[])
	{
		//access value using for loop
		for (Week w:Week.values())
		{
			System.out.println(w);
		}
		//access index
		System.out.print("Sunday index:" +Week.valueOf("Sunday").ordinal());
	
		//access value using for loop
		for (Month m:Month.values())
		{
			System.out.println(m);
		}
		//access index
		System.out.print("October index:" +Month.valueOf("October").ordinal());
	}
}
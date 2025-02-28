/*
Nested For loop
Systex:

for(initialization;condition;++/--) row
{
	for(initialization;condition;++/--) col
	{
		
	}
}
*/
/*
*****
****
***
**
*
*/

class Demo21
{
	public static void main (String args[])
	{
		for(int i=0;i<10;i++) //row
		{
			for(int j=i;j<10;j++) //col
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}




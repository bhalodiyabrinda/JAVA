/*
Array
*/

class Demo22
{
	public static void main (String args[])
	{
		int arr[]={1,2,3,4,5};
		char []carr = {'h','e','l','l','o'};
		boolean b[] = {true,false};
		for (int i=0;i<arr.length;i++)
		{
			System.out.println("Array elements["+i+"]:"+arr[i]);
			System.out.println("Array elements["+i+"]:"+carr[i]);
			System.out.println("Array elements["+i+"]:"+b[i]);
		}
	}
}
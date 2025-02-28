/*
user input
*/
import java.util.*;
class Demo24
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int row,col,i,j;
		System.out.println("Enter row");
		row=sc.nextInt();

		System.out.println("Enter col");
		col=sc.nextInt();
		
		int arr1[][]=new int[row][col];

		for (i=0;i<row;i++) //row
		{
			for (j=0;j<col;j++) //col
			{
				System.out.println("Enter arr["+i+"]["+j+"]:=");
				arr1[i][j]=sc.nextInt();
			}
		}
		System.out.print("Desplay array: ");
		for (i=0;i<row;i++)
		{
			for (j=0;j<col;j++)
			{
				System.out.print(arr1[i][j]+"");
			}
			System.out.println(" ");
		}
	}
}

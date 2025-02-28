import java.util.*; 

public class lab3
{
	public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter your rollno:");
			int rlon = sc.nextInt();
			System.out.println("Enter your CGPA:");
			double cgpa = sc.nextDouble();
			System.out.println("Enter your Branch:");
			String branch = sc.next();
			
			System.out.println("Roll no is:"+rlon);
			System.out.println("CGPR is:"+cgpa);
			System.out.println("Branch is;"+branch);
		}
}

			
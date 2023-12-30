import java.util.*;
class maxnum
{
	public static void main(String args[])
	{
		int x,y,z;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter x");
		x=s.nextInt();
		System.out.println("Enter y");
		y=s.nextInt();
		System.out.println("Enter z");
		z=s.nextInt();
		
		
		if(x>y && x>z)
			System.out.println("maximum number="+x);
		else if(y>z && y>x)
			System.out.println("maximum number="+y);
		else
			System.out.println("maximum number="+z);
	}
}
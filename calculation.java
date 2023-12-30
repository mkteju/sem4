interface numbers
{
 public int process(int x,int y);
}

class sum implements numbers
{
	public int process(int a,int b)
	{ 
	  return(a+b);
	}
}
class average implements numbers
{
	public int process(int a,int b)
	{ 
	 return((a+b)/2);
	}
}

public class calculation 
{
	public static void main(String args[])
	{
	  int n1=10,n2=20;
	  int ans;
	  
	  sum s=new sum();
	  ans=s.process(n1,n2);
	  System.out.println("The sum of"+n1+"ans"+n2+"is="+ans);
	  
	  average a=new average();
	  ans=a.process(n1,n2);
	  System.out.println("Average="+ans);
	}
}
	  
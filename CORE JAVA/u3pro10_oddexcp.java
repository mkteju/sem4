import java.io.*;
class OddException extends Exception
{
 OddException(String msg)
  {
    super(msg);
  }
}
class u3pro10_oddexcp
{
 public static void main(String args[])
 {
   int n;
   int count=0;
   for(int i=0;i<args.length;i++)
   {
    try
	{
      n=Integer.parseInt(args[i]);
      if(n%2==0)
	  {
        System.out.println(n+ "no is even"); 
	  }
      else	  
	  {
		  count++;
		  throw new OddException(n+ "no is odd number");
	  }
	}
	catch(OddException e)
	{
		System.out.println(e);
	}
   }// for loop close;
   System.out.println("\n---------------------------");
   System.out.println("Invalid number:" +count);
 }
}
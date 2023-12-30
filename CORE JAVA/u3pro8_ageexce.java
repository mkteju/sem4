class AgeException extends Exception
{
	  AgeException(String str)
	 {
		 super(str);
	 }
}
public class u3pro8_ageexce // class name
{
 public static void main(String args[])
 {
  int n=args.length; // return length.
  int age[]=new int[n]; // create object.
  int sumage=0; // declare veriable set to 0.
  int aveage=0;
  for(int i=0;i<n;i++)
  {
	  try
	  {
		  age[i]=Integer.parseInt(args[i]); // convert into integer.
	  }
	  catch(NumberFormatException e)
	  {
		  System.out.println("Your input string is not number"+e);
	  }
	  sumage=sumage+age[i];
  }
  aveage=sumage/n;
  System.out.println("Average age of person is :" +aveage);
  
  try
  {
	  for(int i=0;i<n;i++)
	  {
		  if(age[i] < 1 || age[i] > 100)
		  {
			  throw new AgeException(age[i]+ "is invalid age");
		  } 
		  else
			  System.out.println(age[i]+ "is valid age");
	  }
  }
  catch(AgeException a)
  {
	  System.out.println(a);
  }
 }
}
  
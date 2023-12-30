class Exception
{
 public static void main(String args[])
 {
  int no[]=new int[10];
  
  try
  {
	 no[10]=25;
  }
  catch(ArrayIndexOutOfBoundsException e)
  {
	   System.out.println("Array index is out of bounds"+e);
	   no[9]=25;
  }
  catch(ArithmeticException e1)
  {
  }
  finally
  {
	  System.out.println("Final block");
  }
 }
}
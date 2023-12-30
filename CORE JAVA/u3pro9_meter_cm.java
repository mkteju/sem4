class UnitFormatException extends Exception // user define Exception
{
 UnitFormatException(String str)// constructor
 {
  super(str); // initialize the value
 }
}
public class u3pro9_meter_cm // class name
{
  public static void main(String args[]) 
  {
	  int num,value; // declare veriable
	  String str; 
    try
	{
	  num=Integer.parseInt(args[0]); // enter string convert into integer;
	  str=args[1];
	  if(str.equals("meter") || str.equals("centimeter"))
	  {
		   if(str.equals("meter"))
		   {
			   value=num*100;
			   System.out.println(num+ "meter is equal to=" +value+ "centimeter");
		   }
		   else
		   {
			   value=(num*1)/100;
			   System.out.println(num+ "centimeter is equal to="  +value+ "meter");
		   }
	  }
	  else
	  {
	  throw new UnitFormatException("Invalid unit");
	  }
    }
	catch(NumberFormatException e)
	{ System.out.println("Invalid number format=" +e); }
	catch(UnitFormatException a)
    {  System.out.println(a); }
	
	  
  }
}		  
		  
			 
	  
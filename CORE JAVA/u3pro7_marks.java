class u3pro7_marks // class name
{
 public static void main(String args[])// entery point;
 {
  try   // Exception caught by try-catch-final
  {  // give Exception
   int m1,m2,m3; // declares veriable
   m1=Integer.parseInt(args[0]); // enter string convert into integer;
   m2=Integer.parseInt(args[1]);
   m3=Integer.parseInt(args[2]);
   if((m1>0 && m1<=100) && (m2>0 && m2<=100) && (m3>0 && m3<=100)) // marks is >0 and  <=100;
   {
    if(m1>=40 && m2>=40 && m3>=40) // if marks is >40 then pass.
   {
	System.out.println("pass");
	System.out.println("Percentage:" +((m1+m2+m3)*100/300)); // calculate percentage.
   }
	else
	System.out.println("Fail");
   }
  else
   {
    throw new OutOfRangeException("Enter marks in 0-100 Range"); // if marks greter then 100 then Exception occur.
   }
  }
  catch(Exception e) // handle Exception.
  {
    System.out.println(e); // print Exception.
  }
 }
}
class OutOfRangeException extends Exception // user define Exception.
{
	OutOfRangeException(String msg) // constructor.
	{
		super(msg);
	}
}

// When run the program enter the 3 marks.
import java.util.*;
interface Exam

{
 boolean pass(int mark);
}
interface classify
{
 String Division(int avg);
}
class Result implements Exam,classify
{
 public boolean pass(int mark)
 {
  if(mark>=35)
    return true;
  else
    return false;
 }
 public String Division(int avg)
 {
  if(avg>=60)
   return "first";
  else if(avg>=50)
   return "second";
  else
   return "No Division";
  }
}

public class u2pro8_result
{
 public static void main(String args[])
 {
   boolean pass;
   int mark,avg;
   String division;
   
   Result r =new Result();
   Scanner s= new Scanner(System.in);
   
   System.out.println("Enter Mark:");
   mark= s.nextInt();
   System.out.println("Enter Average:");
   avg= s.nextInt();
   
   pass=r.pass(mark);
   division= r.Division(avg);
   if(pass)
    System.out.println("passed-" +division+ ".");
   else
     System.out.println("Failed" );
 }
}
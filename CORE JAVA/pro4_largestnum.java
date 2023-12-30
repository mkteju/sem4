import java.util.*;
class pro4_largestnum
{
 public static void main(String args[])
 {
  int a=Integer.parseInt(args[0]);
  int b=Integer.parseInt(args[1]);
  int c=Integer.parseInt(args[2]);
  if(a>=b  &&  a>=c)
  {
    System.out.println(a+ " Is largest number");
  }
   else if(b>=a  &&  b>=c)
  {
    System.out.println(b+ " Is largest number");
  }
  else
  {
    System.out.println(c+ " Is largest number");
  }
 }
}
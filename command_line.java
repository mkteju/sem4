import java.util.*;
class command_line
{
 public static void main(String args[])
 {
  Scanner a=new Scanner(System.in);
  
  int no1,no2;
  System.out.print("Enter no.1=");
  no1=a.nextInt();
  System.out.print("Enter no.2=");
  no2=a.nextInt();
  
  int cal=(no1+no2);
  System.out.println("----------------");
  System.out.println(no1+"+"+no2+"="+cal);
  System.out.println("----------------");
 }
}
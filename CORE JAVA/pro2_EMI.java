 import java.util.*;
class pro2_EMI
{
 public static void main(String args[])
 {
   Scanner a=new Scanner(System.in);
   double principal,rate,time;
    
   principal=Double.parseDouble(args[0]);
 
   System.out.print("Enter rate:");
   rate=a.nextFloat();
   time=5; 
   rate=rate/(12*100);
   time=time*12;

   double emi=(principal*rate*Math.pow(1+rate,time))/(Math.pow(1+rate,time)-1);
   
   System.out.println("EMI in RS is="+emi+"\n");
  }
}
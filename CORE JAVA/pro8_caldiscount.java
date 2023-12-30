import java.util.*;
class discount
{
 int pv;
 discount(int val)
 {
  pv=val;
 }
 double cal_disc()
 {
	double disc;
  if(pv<=1000)
   disc=pv*0.10;
  else if(pv>1000 && pv<=1500)
   disc=pv*0.12;
  else
   disc=pv*0.15;
  return(disc);
 }
}
class pro8_caldiscount
{
 public static void main(String args[])
 {
	int n;
	Scanner in= new Scanner(System.in);
	System.out.println("Enter parchase value=");
	n=in.nextInt();
	 
	discount d=new discount(n);
	
	double di= d.cal_disc();
	
	System.out.println("Sales value="+n);
	System.out.println("discount calculated="+di);
	System.out.println("Payable amount ="+(n-di));
 }
}
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
   return disc;
  }
}
class sale
{
	public static void main(String args[])
	{
		 int n;
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter perchase value=");
		 n=s.nextInt();
		 discount d=new discount(n);
		 double cal=d.cal_disc();
		 System.out.println("perchase value="+n);
		 System.out.println("calculation of discount="+cal);
		 System.out.println("Payable net amount="+(n-cal));
	}
}
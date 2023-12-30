class deposite
{
 int principal,year;
 int CI;
 deposite(int pri,int y)
 {
  principal=pri;
  year=y;
 }
 int compound(double rate)
 {
  CI=(int)(principal*Math.pow((1+rate/100),year));
  return CI;
 }
}
class com_int
{
 public static void main(String args[])
 {
	 deposite d=new deposite(5000,5);
	 int cal=d.compound(6.5);
	 
	 System.out.println("principal value="+d.principal);
	 System.out.println("Interest Rate= 6.5");
	 System.out.println("Year="+d.year);
	 System.out.println("Compound interest="+cal);
 }
}
 
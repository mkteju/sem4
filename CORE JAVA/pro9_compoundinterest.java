class deposit
{
 int principal,year;
 int CI;
 
 deposit(int pri,int y)
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
class pro9_compoundinterest
{
 public static void main(String args[])
 {
  deposit d= new deposit(5000,5);
  int compound_interest= d.compound(6.5);
   
  System.out.println("principal Amount="+d.principal);
  System.out.println("Rate of interest=6.5% p.a");
   System.out.println("year="+d.year);
    System.out.println("compound interest="+compound_interest);
 }
}
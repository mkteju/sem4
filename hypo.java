class hypo
{
 public static void main(String args[])
 {
  double x=12,y=45;
  System.out.println("X="+x);
  System.out.println("Y="+y);
  
  double num=(x*x)+(y*y);
  System.out.println("Square of x and y ="+num);
  
  double hypotenuse=Math.sqrt(num);
  System.out.println("Hypotenuse of right angle triangle="+hypotenuse);
 }
}
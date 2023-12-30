class pro5_hypotenuse
{
 public static void main(String args[])
 {
   double x=3.0,y=4.0;
   System.out.println("x="+x);
   System.out.println("y="+y);
   
   double num=(x*x)+(y*y);
   System.out.println("The square of x and y is"+num);
   
   double hypotenuse=Math.sqrt(num);
   System.out.println("hypotenuse of right angle triangle is"+hypotenuse);
 }
} 
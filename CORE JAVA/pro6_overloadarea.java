class pro6_overloadarea
{
 static void area(int h)
 {
  int a=h*h;
  System.out.println("Area of square="+a);
 }
 static void area(int l,int h)
 {
  int a=l*h;
  System.out.println("Area of rectangle ="+a);
 }
 public static void main(String args[])
 {
  int a=15,b=20;
  area(a);
  area(a,b);
 }
}
class overload_area
{
  static void area(int h)
  {
   int a=h*h;
   System.out.println("Area of square=" +a);
  }
  static void area(int h,int l)
  {
   int a=l*h;
   System.out.println("Area of ractangle="+a);
  }
  public static void main(String args[])
  {
   int a=23,b=10;
   area(a);
   area(a,b);
  }
}

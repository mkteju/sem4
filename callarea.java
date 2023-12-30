class Area
{
 static int a;
 static int computearea(int w,int h)
 {
  a=w*h;
  return a;
 }
}
class callarea
{
 public static void main(String args[])
 {
	  System.out.println(Area.computearea(4,3));
 }
}
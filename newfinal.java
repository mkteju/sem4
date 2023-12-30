// final keyword
class finaldemo
{
 final int a=10;
 final void show(final int x)
 {
  System.out.println("super class="+x);
 }
}
class newfinal extends finaldemo
{
 public static void main(String args[])
 {
  newfinal f=new newfinal();
  f.show(12);
 }
}
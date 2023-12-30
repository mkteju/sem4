class Add
{
 static int add;
 static int addition(int x,int y)
 {
  add=x+y;
  return add;
 }
}
class static_method
{
 public static void main(String args[])
 {
  System.out.println(Add.addition(12,20));
 }
}
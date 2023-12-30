// Accessing the instance variable of super class using 'super'

class superclass
{
 int b=30;
}
class subclass extends superclass
{
 int b=10;
 void show()
 {
  System.out.println(super.b);
  System.out.println("subclass="+b);
 }
  public static void main(String args[])
  {
   subclass s1=new subclass();
   s1.show();
  }
 }

// calling method of super class using "super" keyword.
class A
{
 void show()
 {
  System.out.println("Super class");
 }
}
class B extends A
{
  void show()
  {
  System.out.println("sub class show method");
  }
  public static void main(String args[])
  {
	A a=new A();
	a.show(); 
    B b=new B();
	b.show();
  }
}



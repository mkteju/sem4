class rectangle
{
 int length,breadth; //instance variable
 
 rectangle(int length,int breadth) //consttuctor overloading
 {                                 // same name but have different parameters
  this.length=length; // java allows same instance variable and parameters then, 'this' keyword
  this.breadth=breadth; // is used to identify the instance variable
 }
 rectangle()// constructor
 {
  length=0;
  breadth=0;
 }
}
class const_overload
{
 public static void main(String args[])
 {
  rectangle r1=new rectangle(10,17);// create an object
  rectangle r2=new rectangle();
  
  System.out.println(r1.length);
  System.out.println(r1.breadth);
  System.out.println(r2.length);
  System.out.println(r2.breadth);
 }
}
 
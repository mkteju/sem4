abstract class calculation
{
 double area;
 abstract double Area();
}
class Rectangle extends calculation
{
 double length,breadth;
 
 Rectangle(double x,double y)
 {
  length=x;
  breadth=y;
 }
 double Area()
 {
  area=length*breadth;
  return area;
 }
}
class Triangle extends calculation
{
 double base,height;
 
 Triangle(double a,double b)
 {
  base=a;
  height=b;
 }
 double Area()
 {
  area=base*height;
  return area;
 }
}
class u2pro9_abstractshape
{
 public static void main(String args[])
 {
  double rc,tri;
  
  Rectangle rec=new Rectangle(6,5);
  rc=rec.Area();
  System.out.println("Rectangle:"+rc);
  
  Triangle tr=new Triangle(6,5);
  tri=tr.Area();
  System.out.println("Triangle:"+tri);
 }
}
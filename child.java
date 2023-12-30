// method overriden
class parent
{
 int i=0;
 void override(int k)
 {
  i=k;
 }
}
class child extends parent
{
 void override(int k)
 {
  i=2*k;
  System.out.println(i);
 }
 public static void main(String args[])
 {
  child c=new child();
  c.override(12);
 }
}
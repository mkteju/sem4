class super_class
{
 float salary=1000;
}
class sub_class extends super_class
{
 int bonus=100;
 
 public static void main(String args[])
 {
  sub s=new sub();
  System.out.println(s.salary);
  System.out.println(bonus);
 }
}
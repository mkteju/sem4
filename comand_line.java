class comand_line
{
 public static void main(String args[])
 {
  int a=Integer.parseInt(args[0]);
  int b=Integer.parseInt(args[1]);
  
  System.out.println("A="+a);
  System.out.println("B="+b);
  
  int cal=(a*b);
  System.out.println("-------------------");
  System.out.println(a+"*"+b+"="+cal);
  System.out.println("-------------------");
 }
}
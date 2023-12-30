class static_withinclass
{
 static int mul;
 static int multiplication(int a,int b)
 {
  mul=a*b;
  return mul;
 }
 public static void main(String args[])
 {
	System.out.println("MUl="+multiplication(12,10));
 }
}
 
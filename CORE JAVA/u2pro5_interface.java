interface numbers
{
 public int process(int x,int y);
}

class sum implements numbers
{ 
 public int process(int a,int b)
 {
  return(a+b);
 }
}

class average implements numbers
{
 public int process(int a,int b)
 {
  return((a+b)/2);
 }
}

class u2pro5_interface
{
 public static void main(String args[])
 {
  int n1=10,n2=20;
  int result;
  
  sum s=new sum();
  result= s.process(n1,n2);
  System.out.println("Sum of two numbers  " +n1+ " and " +n2+ " is :" +result);
  
  average av=new average();
  result= av.process(n1,n2);
  System.out.println("Average of two numbers  " +n1+ " and " +n2+ " is :" +result);
 }
}
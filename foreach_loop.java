class foreach_loop
{
 public static void main(String args[])
 {
  int arr[]={2,3,4,5,6};
  int sum=0;
  
  for(int a:arr)
  {  
   sum+=a;
  }
  System.out.println("sum="+sum);
 }
}
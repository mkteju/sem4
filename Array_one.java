class Array_one
{
 public static void main(String args[])
 {
  int marks[]={12,34,65,34,23};
  int total,average;
  total=0;
  for(int i=0;i<5;i++)
  {
   total += marks[i];
  }
  System.out.println("Total marks="+total);
  average=total/5;
  System.out.println("Average="+average);
 }
}
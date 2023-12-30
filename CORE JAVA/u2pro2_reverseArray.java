class u2pro2_reverseArray
{
 public static void main(String args[])
 {
  int array[]={1,2,3,4,5};
  int i,j,temp;
  System.out.println("Array elements:");
  
  for(i=0;i<5;i++)
  System.out.println(array[i]+ " ");
  j=array.length-1;
  i=0;
  while(i<j)
  {
   temp=array[i];
   array[i]=array[j];
   array[j]=temp;
   i++;
   j--;
  }
 
   System.out.println("\n Array elements in reverse order:");
   for(i=0;i<5;i++)
   System.out.println(array[i]+" ");
  }
}

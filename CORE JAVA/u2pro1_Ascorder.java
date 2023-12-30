import  java.util.*;
class u2pro1_Ascorder
{
 public static void main(String[] args)
 {
  int n,temp,i,j;
  int a[]= new int[args.length];
  
  for(i=0;i<args.length;i++)
  {
   a[i]=Integer.parseInt(args[i]);
  }
  n=args.length;
  for(i=0;i<n;i++)
  {
   for(j=i+1;j<n;j++)
   {
	 if(a[i]>a[j])
     {
    temp=a[i];
	a[i]=a[j];
	a[j]=temp;
    }
   }
  }
  System.out.print("Ascending order=");
  for(i=0;i<n-1;i++)
  {
   System.out.print(a[i]+",");
  }
  System.out.print(a[n-1]);
 }
}
   
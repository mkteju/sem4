import java.util.*;
class  even_odd
{
  public static void main(String args[])
  {
    int n;
    Scanner s= new Scanner(System.in);
    System.out.print("Enter no of elements:");
    n= s.nextInt();
    int a[]=new int[n];
    
    System.out.println("Enter all the elements:");
     for(int i=0;i<n;i++)
     {
        a[i]=s.nextInt();
     }
    System.out.println("Odd numbers:");
     for(int i=0;i<n;i++)
     {
       if(a[i]%2 != 0)
       {
            System.out.println(a[i]+ " ");
        }
     }
    System.out.println("Even number:");
    for(int i=0;i<n;i++)
    {
       if(a[i]%2 == 0)
       {
         System.out.println(a[i]+ " ");
        }
     }
 }
}
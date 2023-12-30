/* write a java program to inpute n integer number and display lowest and second lowest value. Also handle thr different exception possile to be thrown duting execution.*/

class pro5_lowestnum// class name
{
 public static void main(String args[])
 {
  int arr[]={4,6,2,12,56,34};     // array value;
  int N=arr.length;    // return length of array;
  int small,next_small=Integer.MAX_VALUE;
  small=arr[0];
  try // exceptionis cought by try-catch-final.
  {
	 for(int i=1;i<N;i++) // give exception.
	 {
		if(arr[i] < small) // if i < small
        {
			next_small=small; // next_small is a small
			small=arr[i];
		}
		else if(arr[i] < next_small && arr[i] > small)
			next_small=arr[i];
	 }
  }
  catch(Exception e)// handle exception.
  {
	 System.out.println(e);// this statement executed when an Exception occur.
  }
  System.out.println("smallest and second smallest numbers are " +small+ "and"+next_small);
 }
}
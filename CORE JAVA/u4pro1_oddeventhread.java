public class u4pro1_oddeventhread
{
 public static void main(String args[])
 {
  String s=args[0]; // array;
  Runnable r= new oddthread(s); // create object and pass the string s;
  Thread t=new Thread(r); // create thread and pass the object r;
  Runnable r2=new eventhread(s);
  Thread t2=new Thread(r2);
  t.start(); // start the thread
  t2.start();
  try
  {
	 t.join(); // wait for finish the thread;
	 t2.join();
  }
  catch(InterruptedException e)
  {
	  System.out.println(e);
  }
  System.out.println("End of main thread:Both threads completed");
 }
}
class oddthread implements Runnable
{
  int n;
  oddthread(String s)
  {
	  n=Integer.parseInt(s); //for enter the value throught the command line;
  }
  public void run() // run the thread;
  {
	 for(int i=0;i<n;i++)
	 {
		 try
		 {
			if(i%2==1)
			{
			  System.out.println("odd" +i);
			  Thread.sleep(1000);
			}
		 }
		 catch(InterruptedException e)
		 {  }
	 }
   
  }
}
class eventhread implements Runnable
{
	int n;
	eventhread(String s)
	{
	   n=Integer.parseInt(s);
	}
	public void run()
	{
	  for(int i=0;i<n;i++)
	  {
		  try
		  {
			  if(i%2==0)
			  {
				  system.out.println("even" +i);
				  Thread.sleep(2000);
			  }
		  }
		  catch(InterruptedException e)
		  {  }
	  }
	}
}
			  
  
  
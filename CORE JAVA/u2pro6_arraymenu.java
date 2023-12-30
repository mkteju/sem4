import java.util.*;
class numberdata
{
	int arr[]=new int[5];
	numberdata()
	{
		Scanner a=new Scanner(System.in);
		System.out.println("Enter element");
		for(int i=0;i<5;i++)
		{
			arr[i]=a.nextInt();
		}
	}
}
class numplay extends numberdata
{
	numplay()
	{
		super();
	}
	void display()
	{
		System.out.println("Element are=");
		for(int i=0;i<5;i++)
			System.out.println(super.arr[i]);
	}
	void sum_arr()
	{
		int sum=0;
		for(int i=0;i<5;i++)
		{
			sum=sum+super.arr[i];
		}
		System.out.println("Sum of array is="+sum);
	}
	void average()
	{
		int sum=0,avg;
		for(int i=0;i<5;i++)
		{
			sum=sum+super.arr[i];
		}
		avg=sum/5;
		System.out.println("Avrage is="+avg);
	}
	void maxval()
	{
		int maxvalue=super.arr[0];
		for(int i=0;i<5;i++)
		{ 
	      if(arr[i] > maxvalue)
		  { 
	        maxvalue=arr[i];
		  }
		}
		System.out.println("/maximum value="+maxvalue);
	}
	void minval()
	{
		int minvalue=super.arr[0];
		for(int i=0;i<5;i++)
		{
			if(arr[i] < minvalue)
			{
				 minvalue=arr[i];
			}
		}
			System.out.println("Minimun value="+minvalue);
	}
}
class u2pro6_arraymenu
{
	 public static void main(String args[])
	 {
		 numplay np=new numplay();
		 int choice=Integer.parseInt(args[0]);
		 switch(choice)
		 {
			 case 1:np.display();
			 break;
			 case 2:np.sum_arr();
			 break;
			 case 3:np.average();
			 break;
			 case 4:np.maxval();
			 break;
			 case 5:np.minval();
			 break;
			 default:System.out.println("invalid choice");
		 }
	 }
}

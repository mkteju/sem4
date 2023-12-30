class u2pro4_lowestprice
{
  public static void main(String args[])
  {
	  String companyname[]={"company A","company B","company C","company D","company E"};
	  int[] price=new int[] {23,45,3,1,4};
	  
	  int i,j=0;
	  int min=price[0];
	  
	  for(i=0;i<price.length;i++)
	  {
		  if(price[i]<min)
		  {
			  j=i;
			  min=price[i];
		  }
	  }
	  System.out.println("Company name with lowest price=" +companyname[j]);
	  System.out.println("Smallest element present in given array="+min);
  }
}

  
	  
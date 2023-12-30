abstract class vehicle
{
 String vname;
 int numofwheels;
 
 abstract void numwheels();
}

class car extends vehicle
{ 
 car(String str,int n)
 {
  vname=str;
  numofwheels=n;
 
 }
 void numwheels()
 {
  System.out.println("Vehicle name:"+vname);
  System.out.println("No. of wheels:"+numofwheels);
 }
}

class truck extends vehicle
{
 truck(String str,int n)
 {
   vname=str;
   numofwheels=n;
 }
  void numwheels()
  {
  System.out.println("Vehicle name:"+vname);
  System.out.println("No. of wheels:"+numofwheels);
 }
}
 
class u2pro7_abstract_vehicle
{
  public static void main(String args[])
  {
	car c= new car("CAR",4);
	c.numwheels();
	
	truck t= new truck("TRUCK",16);
	t.numwheels();
  }
}
  
  
  
  
  
  
  
  
 
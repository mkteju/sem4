class test1
{
 int x=0;
 static int y=0;
  
 void setx(int n)
 {x=n;}
 void sety(int n)
 {y=n;}
 
 int getx()
 {
  return x;
 }
 int gety()
 {
  return y;
 }
}
class test2
{
  public static void main(String args[])
  {
	  test1 t1=new test1();
	  test1 t2=new test1();
	  t1.setx(9);
	  t2.setx(10);
	 
	 System.out.println("object 1="+t1.getx());
	  System.out.println("object 2="+t2.getx());  
	  System.out.println("value of y="+test1.y);
	  test1.y=7;
	  System.out.println("change value y="+test1.y);
	  t1.sety(test1.y+1);
	 System.out.println("value of y use t2="+t2.gety()); 
	
	 
  }
}  

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
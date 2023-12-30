abstract class vegetable
{
 public String color;// instance variable
}

class cabbage extends vegetable
{
 public String toString()// override the method
 {
  color="Green color";
  return "cabbage-->"+color;
 }
}

class carrot extends vegetable
{
 public String toString()
 {
	color="Reddish_orange color";
	return "carrot-->"+color;
 }
}

class potato extends vegetable
{
 public String toString()
 {
	color="brown_skinned color";
	return "potato-->"+color;
 }
}
class pro10_veg_dis
{
  public static void main(String args[])
  {
	  cabbage c= new cabbage();
	  carrot ca=new carrot();
	  potato p=new potato();
	  
	  System.out.println(c); // This all are respective class.
	  System.out.println(ca);
	  System.out.println(p);
  }
}

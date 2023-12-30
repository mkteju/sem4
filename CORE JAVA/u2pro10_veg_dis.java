abstract class vegetable
{
  public String color;
}
class cabbage extends vegetable
{
	public String tostring()
	{
	 color="green color";
	 return "cabbage-->"+color;
	}
}
class carrot extends vegetable
{
	 public String tostring()
	 {
		 color="Raddish_orange color";
		 return "carrot-->"+this.color;
	 }
}
class potato extends vegetable
{
	public String tostring()
	{
	 color="braown_skinned color";
     return "potato-->"+color;
	}
}
class u2pro10_veg_dis
{
 public static void main(String args[])
 {
   cabbage c=new cabbage();
   carrot ca=new carrot();
   potato p=new potato();
   System.out.println(c);
   System.out.println(ca);
   System.out.println(p);
 }
}
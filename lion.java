// abstract keyword

abstract class animal
{
 String name,species;
 animal(String n,String s)
 {
  name=n;
  species=s;
 }
 void eat(String food)
 {
  System.out.println(species+" "+name+"like"+food);
 }
 abstract void sound(); // abstract method
}
class lion extends animal
{
  lion()
  {
   System.out.println("lion");
  }
 void sound()
 {
	 System.out.println("Roars");
 }
 public static void main(String args[])
 {
	 lion l=new lion();
	 l.eat("flesh");
	 l.sound();
 }
}
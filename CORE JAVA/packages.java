import p1.one; // access the packages
import p2.two;
import p3.three;

public class packages// class name
{
 public static void main(String args[])
 {
  one objone= new one(); // create object
  two objtwo= new two();
  three objthree= new three();
  
  objone.display();// call the all methods from packages in one class
  objtwo.display2();
  objthree.display3();
 }
}
import p.packclass; // import is uesd to access the package in this class.
public class democlass
{
 public static void main(String args[])
 {
  int a=10,b=15,c=5;// declare the veriable and their value.
  
  packclass pc=new packclass(); // create object
  int maxnum=pc.findmax(a,b,c);// object"pc" and call the package method "findmax" that store in 'maxnum'.
  System.out.println("The gretest number:"+maxnum);// print the value by 'maxnum'.
 }
}
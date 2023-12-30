


import java.util.*; // pre-define package
class u3pro4_strmenu // class name
{
  public static void revstr(String str)// revstr method for reverse the string
  {
	 char[] try1= str. toCharArray(); //convert string  into new char Array
	 
	 for(int i=try1.length-1;i>=0;i--)
		 System.out.println(try1[i]);// print the reverse string;
  }
  
  public static void countchar(String str)// countchat method for count the character
  {
	 int count=str.length();// returns the length of string
	 System.out.println("Total no of character :"+count);// print count the character
	 
	 int p=0;// position set to 0;
	 for(int i=0;i<count;i++)// if i < count thrn i++; 
	 {
		 System.out.println("position of letter" +str.charAt(i)+ "is" + ++p);// print the character position
	 }    // charAt():= return the character value at the specify position. 
  }
  
  public static void palindrome(String str)// palindrome means Entered string is same as 
  {                                        // reveres string like "Mom"."moM"
	   String reverse="  ";
	   int length=str.length();// return the length of string;
	   
	   for(int i=length-1;i>=0;i--)// reverse the string
		   reverse = reverse + str.charAt(i);
	   
	   if(str.equals(reverse))// "equals" is used to compare to the reverese string .if both are same then true.
		   System.out.println("Entered string is palindrom");
	   else
	       System.out.println("Entered string is not palindrom");
  }
  
  public static void count_case(String str)// count the upper and lower case.
  {
	 int uppercase=0,lowercase=0;// set to 0;
	 
	 for(int i=0;i<str.length();i++)// if string > then 0 then i++;
	 {
	 if(Character.isLowerCase(str.charAt(i) ) )
	   {
         lowercase++;
       }
       else if(Character.isUpperCase(str.charAt(i) ) )
       {
         uppercase++;
       }
	 }
     System.out.println("No. of uppercase is:"+uppercase);
     System.out.println("No. of lowercase is:"+lowercase);
  }
  
public static void main(String args[])// main method
{
 
 String mystr=new String (args[0]);
 boolean quit=false;
 Scanner in=new Scanner(System.in);
 
 do
 {
	 System.out.println("1..Display each character on seprated line in reverse order");
	 System.out.println("2..Count total no. of character and display each position too");
	 System.out.println("3..Identify that wehther the string id palindrom or not");
	 System.out.println("4..count total no. of uppercase and lowercase");
	 System.out.println("5..quit");
	 System.out.println("Enter your choice:");
	 int choice=in.nextInt();
	 switch(choice)
	 {
		 case 1:revstr(mystr);
		 break;
		 case 2:countchar(mystr);
         break;
         case 3:palindrome(mystr);
         break;
         case 4:count_case(mystr);
         break;
         case 5:quit=true;
         break;
         default:System.out.println("Wrong input");

	 }
 }while(!quit);
}
} 
	 
  
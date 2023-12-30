/* Take a string from a user and validate it.The string should be at least 5 character ans should contain at least one digit.Display appropriate valid message.*/

import java.util.*;// take input by the user.
class u3pro6_strvalid // class name
{
 public static final int STR_LENGTH=5;
 
 public static void main(String args[])
 {
  Scanner input=new Scanner(System.in); // object of input.
  System.out.println(
   "\n 1.String must have 5 character." +
   "\n 2.String consist only letter and digit" +
   "\n 3.string must contain at least one digit"+
   "\n Input a string"); // This all are the condition.
   
   String s=input.nextLine();
   
   if(is_valid_string(s))
   {
	   System.out.println("String is valid :"+s);
   }
   else
   {
	   System.out.println("Not a valid String :"+s);
   }
 }
 public static boolean is_valid_string(String password)// string is valid or not ?;
 {
   if(password.length() < STR_LENGTH)return false;
   int charcount=0;
   int numcount=0;   // set to 0;
   for(int i=0;i<password.length(); i++)
   {
	  char ch=password.charAt(i); //return password value at position.
	  if(is_Numeric(ch))numcount++;
	  else if(is_Letter(ch))charcount++;
	  else return false; 
   }
   return (charcount >=2 && numcount >=1);
 }
 public static boolean is_Letter(char ch)
 {
	  ch=Character.toUpperCase(ch);
	  return(ch>='A' && ch<='Z');
 }
 public static boolean is_Numeric(char ch)
 {
	 return (ch >= '0' && ch <='9');
 }
}
   
 
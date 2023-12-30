// Invoking the constructor of the super class using 'super' keyword

class principal
{
	principal()
	{
		System.out.println("principal");
    }
}
class Teacher extends principal
{
 Teacher()
 {
  System.out.println("Teacher");
 }
}
class student extends Teacher
{
 student()
 {
  System.out.println("student");
 }
 public static void main(String args[])
 {
	 student s=new student();
 }
}
 
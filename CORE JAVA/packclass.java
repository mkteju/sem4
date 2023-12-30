package p; // it is a directory . To identify the location where the class is stored in directory "package"is used.
  //    |->"p" is package name.
public class packclass 
{
 public int findmax(int x,int y,int z)// to find the maximum number;
 {
  if(x>y && x>z)
   return x;
  else if(y>x && y>z)
   return y;
  else 
   return z;
  }
}

// package is only compile as: javac -d . class_name.java
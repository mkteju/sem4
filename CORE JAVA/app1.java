import java.applet.*;
import java.awt.*; // applet interect with user through AWT
/* <applet code=app1 width=300 height=300> // create window
  </applet>
 */
 public class app1 extends Applet
 {
   public void paint(graphics g)
   {
     g.drawstring("Hello Applet",100,100);
   }
 }
	
  
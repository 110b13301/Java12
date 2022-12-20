package pack6;
import pack6.subpack1.CCircle;
import pack6.subpack1.subsubpack.CStyle;
import pack6.subpack2.CRectangle;
public class Class08
{
   public static void main(String args[])
   {
      CCircle cir=new CCircle();
      CRectangle rect=new CRectangle();
      CStyle s=new CStyle(1); //create CStyle object and set "style" to 1
      cir.show();
      rect.show();
   }
}

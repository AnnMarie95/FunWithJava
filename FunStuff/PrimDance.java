import java. util.*;
import java.lang.reflect.*;
import java.util.Vector.*;
public class PrimDance
{
  public static void main(String[]args)
  {
     double a = 600.0; 
     char b = 'z' ;
     int e = 6;
     boolean d = true;
     
     Vector primdance = new Vector();
     primdance.addElement(a);
     primdance.addElement(b);
     primdance.addElement(e);
     primdance.addElement(d);
     
     while(!primdance.isEmpty())
     {
      Object o;
      Class c;
      String s;
         
         o = primdance.firstElement();
         c = o.getClass();
         s = c.getName();
         
         if(s.equals("java.lang.Double"))
         {
            System.out.println("double = "+ a);
         }
         
         if(s.equals("java.lang.Character"))
         {
            System.out.println("char = "+ b);
         }

         if(s.equals("java.lang.Integer"))
         {
            System.out.println("int = "+ e);
         }
         
         if(s.equals("java.lang.Boolean"))
         {
            System.out.println("boolean: "+ d);
         }
         primdance.remove(0);


         
             }
    
  }
  
 } 
     
     
      
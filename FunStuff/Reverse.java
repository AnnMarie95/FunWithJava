public class Reverse
{
  public static void main (String[]args)
  {
   String first = " I Love Pizza! ";
   String reverse;
   
   String thing = other(first);
   System.out.println (thing);
  }
 
  
  public static String other( String forward)
  {
   String other = "";
   //char c[] = new char[length];
   for (int i = forward.length() - 1 ; i >= 0 ; --i)
   {
     //char me = forward.charAt(i);
     other = other + forward.charAt(i);
   }
   
  return other;
  }
  //System.out.print( other);
 }
      
   
  
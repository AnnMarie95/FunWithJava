public class DemonstratingStringMethods
{
  public static void main(String[]args)
  {
   String sentence = "You can never cross the ocean until you have the courage to lose sight of the shore. - Christopher Colombus";
   
   System.out.println (sentence.indexOf('v'));
   System.out.println (sentence.indexOf('x'));
   System.out.println (sentence.charAt(16));
   System.out.println (sentence.endsWith("bus"));
   System.out.println (sentence.endsWith("car"));
   System.out.println (sentence.replace('c' , 'C'));
   
   }
   
  }
   
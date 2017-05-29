import java.util.*;

public class ThreeLetterAcronym
{
 public static void main(String[]args)
 {
  String Word1;
  String Word2;
  String Word3;

  Scanner word = new Scanner(System.in);
  
  System.out.println("Please enter aWord");
  Word1 = word.nextLine();
  
  
  System.out.println("Please enter aWord");
  Word2 = word.nextLine();
  
  
  System.out.println("Please enter aWord");
  Word3 = word.nextLine();
  
  Word1 = Word1.toUpperCase();
  Word2 = Word2.toUpperCase();
  Word3 = Word3.toUpperCase();
  
  System.out.print(Word1.charAt(0) + "" + Word2.charAt(0) + "" + Word3.charAt(0));

   }
  
 }
   

 
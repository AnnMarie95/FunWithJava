import java.util.*;


public class CountSpaces2
{
 public static void main(String[]args)
 {
   String sentence;
   Scanner sent = new Scanner(System.in);
   System.out.println("Please enter phrase");
   sentence = sent.nextLine();
    
    int WordCount= 0; 
  
  for(int x = 0; x < sentence.length(); x++)
   if (sentence.charAt(x) == ' ')
      ++WordCount;
      
      System.out.println(WordCount);
      
   }
 }
      
     
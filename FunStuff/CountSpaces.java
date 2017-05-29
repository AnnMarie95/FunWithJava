
public class CountSpaces
{
 public static void main(String[]args)
 {
  String Sentence = " The person who says something is possible should not interupt the person who is doing it ";
  int WordCount= 0; 
  
  for(int x = 0; x < Sentence.length(); x++)
   if (Sentence.charAt(x) == ' ')
      ++WordCount;
      
      System.out.println(WordCount);
      
   }
 }
      
     
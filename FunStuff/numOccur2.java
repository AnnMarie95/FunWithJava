public class numOccur2
{
 public static void main(String[]args)
 {
  String String1 = "break, keep, stop, keep ,come, go, keep" ;
  String String2 = "keep";
  
  int count = 0;
  int locate = String1.indexOf(String2,0);
  
 
 
 if (locate != -1)
   {
    count ++;
   }
   
  do
  {
    locate = String1.indexOf(String2,locate + 1);
    if(locate != -1)
      {
         count ++;
         locate ++;
      }
    }
      while (locate != -1);
    
   System.out.println ("the word repeated is" + count );
   
   }
   
  }
   
   
   
   
 
 
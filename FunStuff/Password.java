import java.util.*

public class Password
{
 public static void main(String[]args)
 {
  String Password;
  String RepeatPass;
  int length;
  int num;
  boolean Let;
  boolean Dig;
  
  Scanner Pass = new Scanner(System.in);
  
  System.out.println("Please enter a password with not less than 6 letters and not more than 10 letters !");
  Password = Pass.nextLine();
  
  
  if (length >=6 || length <= 10 || !( Password. isLetorDig))
   {
    System.out.println("Please re-enter password");
    RepeatPass = Pass.nextLine();
     while
     {
       if( Password.isLetorDig(RepeatPass)
      System.out.println("Password set");
      Password = Pass.nextLine();
      }  

    else
     System.out.println ("Error please re do password");
    }
    
             
  }    
      
      
      
      
      
      
     }
     
  }
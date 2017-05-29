import java.util.*;

public class DogBoarding

 { 
 
    public static void main(String[]args)
    
    {  
      int DogsWeight;
      int NumOfDays;
     
      
      Scanner inputDevice= new Scanner(System.in);
      System.out.println( " Please enter Dogs weight " );
      
      DogsWeight = inputDevice.nextInt();
      Scanner secondinputDevice= new Scanner(System.in);
      System.out.println( " Please enter number of days " );
      
      NumOfDays = secondinputDevice.nextInt();
      double TotalPrice = ( DogsWeight* 0.5) * NumOfDays;
      System.out.println( " Total Price " + TotalPrice );
    
    }
    
 }
      
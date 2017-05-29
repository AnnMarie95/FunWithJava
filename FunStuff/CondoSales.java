import java.util.*;

public class CondoSales 
{ 
  public static void main(String[]args)
  {
    int Option;
    int Parking;
    
    Scanner Input = new Scanner(System.in);
    System.out.println ("Please enter option");
    Option = Input.nextInt();
    
    
    if(Option == 1)
      System.out.println( " Park view which costs $150,000" );
      
    else if(Option == 2)
      System.out.println( " Golf course view which costs $170,000 ");
     
   else if(Option == 3)
      System.out.println( " Lake view which costs $210,000");
    
    else
      System.out.println( "Error! $0" );
 
    
    if(1<= Option && Option<=3)
      System.out.println (" Enter 1 for Garage. Enter 2 for parking space ");
      Parking = Input.nextInt();
      
    if (Parking == 1 && Option == 1)
      System.out.println (" Will cost $155,000 ");
    else if (Parking == 1 && Option == 2)
      System.out.println (" Will cost $175,000 ");
    else if (Parking == 1 && Option == 3)
      System.out.println (" Will cost $215,000 ");
    else if ( Parking == 2)
      System.out.println ( " Your price stays the same" );
    else
      System.out.println (" ERROR!" );
    
    
   /*if (Option == 1)
      System.out.println ("Please enter option for parking spce");
     
    else if (Option == 2)
      System.out.println */
      
      
   }
   
}

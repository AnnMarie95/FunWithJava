import java.util.*;
public class Eggs

{ 
   public static void main (String[]args)
   
   {
     int NumOfEggs;
     double PriceOfDozen= 3.25;
     double PriceOfLoose= 0.45;
     
     Scanner inputDevice=new Scanner(System.in);
     
     System.out.println( " Please enter NumOfEggs ");
     
     NumOfEggs = inputDevice.nextInt();
     int EggsInDozen = NumOfEggs/12;
     int NumOfLoose = NumOfEggs%12;
     double TotalPrice = (EggsInDozen * 3.25 ) + ( NumOfLoose * 0.45); 
     
     System.out.println ( "You ordered " + NumOfEggs + " eggs . That's " + EggsInDozen + " dozen at $3.25 per dozen and " + NumOfLoose + " loose eggs at 45 cents each. Your total price is " + TotalPrice ) ;
     
        }
        
      } 
     
     
     
     
   
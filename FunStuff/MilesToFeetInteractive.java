import java.util.*;
public class MilesToFeetInteractive
{

    public static void main (String[]args)
    
    {
      int feetinmile = 5280;
      
      double distance;
      
      Scanner inputDevice = new Scanner(System.in);
      System.out.println("Please enter distance in mile");
      distance = inputDevice.nextDouble();
      
       
      System.out.println("The distance between my uncle's house is " + distance + " miles or " + feetinmile * distance  + " feet" );
            }
      
  }
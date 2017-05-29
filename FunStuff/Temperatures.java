import java.util.*;

public class Temperatures
{
  public static void main (String[]args)
  
  {
  
  int hightemp;
  int lowtemp;
  int difference;
  
  Scanner Input = new Scanner(System.in);
  System.out.println(" Please enter high temperature ");
  hightemp = Input.nextInt();
  
  System.out.println(" Please enter low temperature ");
  lowtemp = Input.nextInt();
  
  difference = hightemp - lowtemp;
  
  if (hightemp >=90) 
      System.out.println(" Heat Warning ");
  if (lowtemp <=32)
      System.out.println(" Freeze Warning");
  if (difference >=40)
      System.out.println(" Huge temperature swing");
      
 } 
  
  }
  
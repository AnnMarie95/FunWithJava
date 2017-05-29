import java.util.*;
public class InBetween
{
 public static void main(String[]args)
 {
  int x;
  int y;
  int z;
  
  Scanner num = new Scanner(System.in);
  System.out.println("Please enter number");
   x = num.nextInt();
  System.out.println("Please enter next number");
   y = num.nextInt();
  
  
  
  if (x<y)
  {
   for ( z = x + 1; z < y; ++z)
  
   System.out.println(z);
  }
  
  if (y<x)
  {
   for ( z = y + 1; z<x ; ++z)
  
   System.out.println(z);
  }

  
  
  if ( x == y)
  {
   System.out.println("error");
  }
  
  if (y == x + 1)
  {
   System.out.println("No number in between");
  }
  
  if (x == y - 1)
  {
   System.out.println("No number in between");
  }
  
 }
 
}

  
  
 
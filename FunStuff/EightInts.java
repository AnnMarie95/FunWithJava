import java.util.*;

public class EightInts
{
 public static void main(String[]args)
 {
  int[] integers = { 1,2,3,4,5,6,7,8 };
  
  System.out.println(Arrays.toString( integers));
  
  for( int i = 0; i<integers.length/2;   i++ )
  {
   int temp = integers[i];
   integers[i] = integers[integers.length - i - 1];
   integers[integers.length -i - 1] = temp;
  }
  
  System.out.println(Arrays.toString(integers));
   
  
 }
 
}
  
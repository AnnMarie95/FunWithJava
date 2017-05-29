import java.util.*;

public class NumberListDemo
{
 public static void main(String[]args)
 {
 
  int val;
  int num;
  int total = 0;
  int[] integers = { 1,2,3,4,5,6,7,8 };
  int smallest = Integer.MAX_VALUE;
  int largest = Integer.MIN_VALUE;
  
  System.out.println(Arrays.toString( integers));
  
  for( int i = 0; i<integers.length/2;   i++ )
  {
   int temp = integers[i];
   integers[i] = integers[integers.length - i - 1];
   integers[integers.length -i - 1] = temp;
  }
  
  System.out.println(Arrays.toString(integers));
  
   for(val = 1; val < 10; ++val)
   {
    int sum = 0;
    
    for ( num = 1; num < val; ++num)
    {
     sum = sum + num;
     
     
     
    
             
    }
  System.out.println(sum);

  }
  
 System.out.println("Numbers below " + "5");
 for (int i = 0; i < integers.length; i++) 
 {
    if (integers[i] < 5) 
  {
        System.out.println(integers[i]);
}

}
for(int i =0;i<integers.length;i++) 
{

  if(smallest >integers[i]) 
  {

     smallest = integers[i];

            }

        }

         
        System.out.println("Smallest number in array is : " + smallest);
 
  for(int i = 0; i < integers.length; i++) 
   {

    if(integers[i] > largest) 
    {

     largest = integers[i];

            }

        }

         
        System.out.println("Highest number in array is : " + largest);
        
        for(int i = 0; i<integers.length; i++)
        {
         total = total + integers[i];
        }
        
        double average = total/integers.length;
        
        System.out.println("Average is " + average);

      
 System.out.println("Numbers above " + "average");

 for (int i = 0; i < integers.length; i++) 
 {
    if (integers[i] > average) 
  {
        System.out.println(integers[i]);
}
  
 }
  
}
}
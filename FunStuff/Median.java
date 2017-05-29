
public class Median
{
   public static double median(int array[])
   {
    int Len = array.length;
    double med = 0.0;
       if(Len%2 != 0 )
      {
         med = array[(Len/2)];
         System.out.println("Median is " + " " + med);
      }
    if (Len%2 == 0 )
      {
         med = (array[Len/2] + array[(Len/2)-1])/2.0;
         System.out.println("Median is " + " " + med);
      }
      
      return med;
    }
public static void main(String[]args)
   {
     int numbers[] = {1,2,3,4,5};
     //int numbers[] ={1,2,3,4,5,6};
    // System.out.print(numbers);
                
     median(numbers);
      
   
   }
   
  }
  
 
    
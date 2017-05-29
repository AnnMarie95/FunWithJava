public class EightInts2
{
 public static void main(String[]args)
 {
  int[] num = {1, 2, 3, 4, 5, 6, 7, 8};
  System.out.println(" first to last ");

  for(int x = 0; x < num.length; x++)
  {
    System.out.print(num[x] + " ");
  }
    System.out.println(" \n last to first ");
   
   
  for(int x = num.length - 1; x >= 0; x--)
   {
     System.out.print(num[x] + " ");
   }
 }
}
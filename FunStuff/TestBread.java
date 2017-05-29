public class TestBread
{
 public static void main (String[]args)
 {
  Bread Bread1 = new Bread("Wheat", 45 );
  Bread Bread2= new Bread("Challah" , 100);
  Bread Bread3 = new Bread("White" , 23);
  
 System.out.println(" The first bread type is " + Bread1.getBreadType() + " and calories are " + Bread1.getCalsPerSlice() + "\n" + Bread1.MOTTO );
 System.out.println(" The second bread type is " +Bread2.getBreadType() + " and calories are " + Bread2.getCalsPerSlice()+ "\n" + Bread1.MOTTO);
 System.out.println(" The third bread type is " + Bread3.getBreadType() + " and calorie are " + Bread3.getCalsPerSlice()+ "\n" + Bread1.MOTTO);
 
 }
 
}
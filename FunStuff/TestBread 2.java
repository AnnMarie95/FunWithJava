public class TestBread
{
 public static void main (String[]args)
 {
  Bread Bread1 = new Bread("Wheat", 45 );
  Bread Bread2= new Bread("Challah" , 100);
  Bread Bread3 = new Bread("White" , 23);
  
 System.out.print("The first bread type is" + Bread1.getBreadType() + "and calories are" + Bread1.getCalsPerSlice);
 System.out.print("The second bread type is" +Bread2.getBreadType() + "and calories are" + Bread2.getCalsPerSlice);
 System.out.print("The third bread type is" + Bread3.getBreadType() + "and calorie are" + Bread3.getCalsPerSlice);
 
 }
 
}
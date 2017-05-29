public class TestSandwichFilling
{
 public static void main (String[]args)
 {
  SandwichFilling SF1 = new SandwichFilling("Tuna Salad", 45);
  SandwichFilling SF2 = new SandwichFilling("Egg Salad", 55);
  SandwichFilling SF3 = new SandwichFilling("Chicken Salad", 100);
  
  
  System.out.println("The filling type is " + SF1.getfillingtype() + " and calories are " + SF1.getCalories()) ;
  System.out.println("The filling type is " + SF2.getfillingtype() + " and calories are " + SF2.getCalories());
  System.out.println("The filling type is " + SF3.getfillingtype() + " and calories are " + SF3.getCalories());

  }
  
}
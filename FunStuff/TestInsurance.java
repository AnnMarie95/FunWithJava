import java.util.*;
import java.lang.reflect.*;
import java.util.Vector;

public class TestInsurance
{
   public static void main(String[]args)
   {
      AutoInsurance policy1 = new AutoInsurance();
      HomeInsurance policy2 = new HomeInsurance(); 
      LifeInsurance policy3 = new LifeInsurance();
      
      policy1.setAuto(2222, "Ann Marie" , 100.0, 200.0, 300.0, "2zz", "MA", "Car", 2015);
      policy2.setHome(3333, "Kate Book" , 100.0, 200.0, 300, 2006 );
      policy3.setLife(4444, "Alex Matt" , 100.0, 200.0, "Jane Sal", 2000);
      
      Vector insurance = new Vector();
      insurance.addElement(policy1);
      insurance.addElement(policy2);
      insurance.addElement(policy3);
      
      
      while (!insurance.isEmpty())
      {
         Object o;
         Class c;
         String s;
         
         o = insurance.firstElement();
         c = o.getClass();
         s = c.getName();
         
         if(s.equals("AutoInsurance"))
         {  
            System.out.println("Kind " + " " +policy1.getMake());
            System.out.println("Name " + " " +policy1.getName());
            System.out.println("Deduct "+ " " + policy1.getDeduct());
            System.out.println("Model " +" " + policy1.getModel());
            System.out.println("State " +" " + policy1.getState());
            System.out.println("Year " +" " + policy1.getYear());
         }
         
        if (s.equals("HomeInsurance"))
         {
            System.out.println("Kind " +" " + policy2.getMake());
            System.out.println("Name " +" " + policy2.getName());
            System.out.println("Deduct " +" " + policy2.getDeduct());
            System.out.println("Year" +" " + policy2.getYear());
            
         }
         
        if (s.equals("LifeInsurance"))
         {
            System.out.println("Kind " +" " + policy3.getMake());
            System.out.println("Name " +" " + policy3.getName());
            System.out.println("Deduct " + " " +policy3.getBeneficiary());
            System.out.println("Year" + " " +policy3.getYear());
            
         }
         
         insurance.remove(0);
       
       }


   }
   
}
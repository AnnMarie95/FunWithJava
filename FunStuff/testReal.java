class testReal
{
public static void main(String args[])
 {
   Real real1= new Real();
   Real real2 = new Real();

   real1.setleft(12);
   real1.setright(06);
   real2.setleft(2);
   real2.setright(50);

   Real Sum = new Real();
   Real sum1= Sum.add(real1,real2);
   Real sum2 =Sum.multiply(real1,real2);
   Real sum3 = Sum.subtract(real1,real2);

   double sum= sum1.Doubler();
   double mul= sum2.Doubler();
   double sub= sum3.Doubler();
   System.out.println("sum "+sum);
   System.out.println("Mul "+mul);
   System.out.println("Diff "+sub);
   
   }
   
  }


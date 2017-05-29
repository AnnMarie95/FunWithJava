import java.util.*;
public class Real
{
 private long left, right;
  double number = 0;
   
  public long getleft()
   {
    return left;
   }
   public void setleft(long l)
   {
    left = l;
   }
   
   public long getright()
   {
    return right;
   }
   public void setright(long r)
   {
    right = r;
   }
   
   public double getNumber()
   {
    return number;
   }
   public void setNumber(long numb)
   {
    number = numb;
   }
  public Real convert (double x)
  {
   String num = Double.toString(x);
   int dot = num.indexOf(".");
   String l = num.substring(0,dot);
   String r = num.substring(dot + 1, num.length());
   System.out.print("left is" + num);
   System.out.print("right is" + num);
   
   Real sample = new Real();
   sample.left = Long.parseLong(l);
   sample.right = Long.parseLong(r);
   return sample;
 }
   
  public double Doubler()
  {
   String a = String.valueOf(left);
   String b = String.valueOf(right);
   String numb = a +" . "+ b;
   double Real = Double.parseDouble(numb);
   return Real;
  }
  
  
  public Real add(Real x, Real y)
  {
   double x1 = x.Doubler();
   double y1 = y.Doubler();
   
   double sum = x1 + y1;
   return convert(sum);
  }
 
 public Real subtract(Real x, Real y)
 {
  double x1 = x.Doubler();
  double y1 = y.Doubler();
  double difference = x1 - y1;
  return convert(difference);
 }
 
 public Real multiply(Real x, Real y)
 {
  double x1 = x.Doubler();
  double y1 = y.Doubler();
  double multiply = x1 * y1;
  return convert (multiply);
 }
 
}

   
   
   
   /*real convert to real (double X)
   double convert to dorn(real X)
   real add(real x,real y)*/
    
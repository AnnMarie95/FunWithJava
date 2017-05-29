import java.lang.*;

public class Circle
{
   int radius;
   int diameter;
   double area;

public Circle() 
{ 
   radius = 1;
   diameter = radius * 2; 
   area = Math.PI*(radius * radius);
   
 }
 
 public int getradius()
 {
  return radius; 
 }
 
 public int getdiameter()
 {
  return diameter;
 }
 
 public double getarea()
 {
  return area;
 }
 
 
 public void setradius( int rad )
 {
   radius = rad;
   diameter = radius * 2;
   area = Math.PI*(radius * radius);
   
   }
 
 }
 
 


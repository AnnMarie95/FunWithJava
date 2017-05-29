public class TestCircle

{
  public static void main (String[]args)
  {
    Circle circ1 = new Circle();
    Circle circ2 = new Circle();
    Circle circ3 = new Circle();
    
    circ1.setradius(6);
    circ2.setradius(90);
    
    System.out.println(" Radius is " + circ1.getradius() + " diameter is " + circ1.getdiameter()+ " area is " + circ1.getarea()); 
    System.out.println(" Radius is " + circ2.getradius() + " diameter is " + circ2.getdiameter()+ " area is " + circ2.getarea());
    System.out.println(" Radius is " + circ3.getradius() + " diameter is " + circ3.getdiameter()+ " area is " + circ3.getarea());
  }
  
}
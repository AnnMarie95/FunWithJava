public class TestInvoice
{
 public static void main (String[]args)
 
 {
   /*Invoice TestInvoice = new Invoice();*/
   
   Invoice invoice1 = new Invoice( 1234, 12.24, 10, 3, 2004 );
   Invoice invoice2 = new Invoice( 7894, 13.0, 7, 9, 2013);
   Invoice invoice3 = new Invoice( 5678, 24.5, 4, 10, 2012);
   Invoice invoice4 = new Invoice( 456, 23, 0, -2, 1990);
   
   int testIN = invoice4.IN;
   
   System.out.println(invoice1.IN + " , " +  invoice1.Baldue + ",  " + invoice1.M + " , " + invoice1.Dy + " , " + invoice1.Yr );
   System.out.println(invoice2.IN + " " +  invoice2.Baldue + " " + invoice2.M + " " + invoice2.Dy + " " + invoice2.Yr );
   System.out.println(invoice3.IN + " " +  invoice3.Baldue + " " + invoice3.M + " " + invoice3.Dy + " " + invoice3.Yr );
   System.out.println(invoice4.IN + " " +  invoice4.Baldue + " " + invoice4.M + " " + invoice4.Dy + " " + invoice4.Yr );
   
   }
   
 }
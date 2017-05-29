import java.util.Arrays.*;
public class EmpArray
{
 public static void main(String[]args)
 {
  String[][] student = new String [3][3];
  
     student [0][0] = "Ann";
     student [0][1] = "Marie";
     student [0][2] = "2.9";
     
     student [1][0] = "Pat";
     student [1][1] = "Mary";
     student [1][2] = "3.2";
    
     student [2][0] = "Joseph";
     student [2][1] = "Chloe";
     student [2][2] = "3.0";
     
  String[][] employee = new String [3][3];
  
     employee [0][0] = "Ann";
     employee [0][1] = "Marie";
     employee [0][2] = "1500";
     
     employee [1][0] = "Pat";
     employee [1][1] = "Mary";
     employee [1][2] = "2500";
     
     employee [2][0] = "Joseph";
     employee [2][1] = "Chloe";
     employee [2][2] = "3500";
     
  for (int i=0; i < employee.length; i++)
   {
    for (int j = 0; j< student.length; ++j)
    {
      String x = employee [i][2];
      double salary = Double.parseDouble(x);
  
      if ((student [i][0].equals(employee[i][0])) && (student [j][i].equals (employee[i][1])))
      {
         System.out.println();
         
         String y = student[i][2];
         double gpa = Double.parseDouble(y);
         
         System.out.println("GPA is," + gpa);
         
         if (gpa >= 3.0 )
            {
               System.out.println ("GPA is greater than 3");
               
               double xy = salary + salary * .1;
               String T = Double.toString(xy);
               
               employee[i][2] = T;
               
               
         }
         
         for( int a = 0; a < employee.length; a++ )
         {
           for (int b = 0; b < student.length; b++)
           {
             System.out.println(" " + a + " " + b + " " + employee[a][b]);
             
             
        }       
      }
     
     }   
   
   }          
  }
 }
}    
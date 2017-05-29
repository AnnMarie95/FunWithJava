public class Students
{
  String firstname;
  String lastname;
  double gpa;
  
  public Students(String f, String l, double g){
  firstname = f;
  lastname = l;
  gpa = g;
  
  
  }
  
  public String getfirstname()
  {
   return firstname;
  }
  public void setfirstname(String FN)
  {
   firstname = FN;
  }
  
  public String getlastname()
  {
   return lastname;
  }
  public void setlastname(String LN)
  {
   lastname = LN;
  }
  
  public double getgpa()
  {
   return gpa;
  }
  public void setgpa(double g)
  {
   gpa = g;
  }
  
 }
   
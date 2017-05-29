public class Employee
{
  String firstname;
  String lastname;
  double salary;
  
  public Employee(String f, String l, double sal){
  firstname = f;
  lastname = l;
  salary = sal;
  
  
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
  
  public double getsalary()
  {
   return salary;
  }
  public void setsalary(double S)
  {
  salary = S;
  }
  
 }
   
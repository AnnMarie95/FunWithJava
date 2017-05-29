public class Recording
{
 
  String Title;
  String Artist;
  double seconds;
  
  public String getTitle()
  {
   return Title;
  }
  public void setTitle (String t)
  {
   Title = t;
  }
  
  public String getArtist()
  {
   return Artist;
  }  
   public void setArtist(String art)
  {
   Artist = art;
  }
  
   public double getseconds()
  {
   return seconds;
  }
   public void setseconds(double s)
  { 
   seconds = s;
  }
  
  public void display()
  {
   System.out.println("Artist" + getArtist());
   System.out.println("Title" + getTitle());
   System.out.println("Seconds" + getseconds());
   System.out.println("--");
  }
}


    
  
 public class Student
{
public int idNum;
public CollegeCourse[] courses = new CollegeCourse[3];

public int getID()
{
return idNum;
}

public void setID(int i)
{
idNum = i;
}

public CollegeCourse getCourse(int c)
{
return courses[c];
}

public void setCourse(CollegeCourse c, int i)
{
courses[i] = c;
}

public void displayCourse(CollegeCourse c)
{
System.out.println("Course ID: " + c.getID());
System.out.println("Credit Hours: " + c.getCredits());
System.out.println("Grade: " + c.getGrade());
System.out.println("---------------------------");
}
}


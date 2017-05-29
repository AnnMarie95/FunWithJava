public class Student
{
 private int idNum;
 
 private CollegeCourse[] courses = new CollegeCourse[3];

 public int getID()
 {
   return idNum;
 }

 public void setID(int i)
 {
   idNum = i;
 }

 public CollegeCourse getcourseID(int c)
 {
   return courseid[c];
 }

 public void setcourseID(CollegeCourse c, int i)
 {
   course[i] = c;
 }
 

 public void displayCourse(CollegeCourse c)
 {
  System.out.println("Course ID: " + c.getcourseID());
  System.out.println("Credit Hours: " + c.getCredits());
  System.out.println("Grade: " + c.getLetGrade());
  System.out.println("---------------------------");
 }

 }

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
  System.out.println("Course ID: " + c.courseID());
  System.out.println("Credit Hours: " + c.getCredits());
  System.out.println("Grade: " + c.getLetGrade());
  System.out.println("---------------------------");
 }

 }

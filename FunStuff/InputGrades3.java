import java.util.*;
public class InputGrades3
{
 public static void main(String arg[])
 {
  Scanner input = new Scanner(System.in);
  Student[] students = new Student[2];
  CollegeCourse[] course = new CollegeCourse[3];

  for(int i = 0; i < students.length; i++)
  {
   students[i] = new Student();
   System.out.println("Enter ID Number for Student " + (i + 1) + ":");
   students[i].setID(input.nextInt());
    
   for(int h = 0; h < course.length; h++)
   {
    course[h] = new CollegeCourse();
    System.out.println("Enter Course ID For Class " + (h + 1) + " for Student " + students[i].getID());
    course[h].setcourseID(input.nextLine());
//input.nextLine();
    System.out.println("Enter Credit Hours For Class " + (h + 1) + " for Student " + students[i].getID());
    
    course[h].setCredits(input.nextInt());
    System.out.println("Enter Grade For Class " + (h + 1) + " for Student " + students[i].getID());
    
    char g = input.next().charAt(0);
    while(g != 'A' && g != 'B' && g != 'C' && g != 'D' && g != 'F')
    {
      System.out.println("Grade not valid. Grade must be A, B, C, D, or F. Enter grade again: ");
      g = input.next().charAt(0);
    }
     course[h].setGrade(g);
     students[i].setCourse(course[h], h);
    }
   }
   
   for(int i = 0; i < students.length; i++)
   {
    System.out.println("Student ID Number: " + students[i].getID());
    System.out.println("---------------------------");
 
   for(int h = 0; h < course.length; h++)
   {
     students[i].displayCourse(students[i].getCourse(h));
   }
   }
  }
 }
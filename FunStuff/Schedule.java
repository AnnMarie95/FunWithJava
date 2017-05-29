import java.util.*;
public class Schedule
{
 public static void main(String arg[])
 {
  Scanner input = new Scanner(System.in);
  String[][] courses = { {"CLS 110", "Th 3:30"},
                         {"CLS 111", "Th 4:30"},
                         {"CLS 112", "Th 5:30"},
                         {"CLS 113", "Th 6:30"} };

  System.out.println("Search by entering a course name ");
  System.out.println("Or by etntering the time and day.  1 for course name, 2 for time");
  int i = input.nextInt();
  input.nextLine();
  i--;
  String want = " ";
  String search = " ";

  if(i == 0)
  {
   System.out.println("Enter the course you would like to see the time for");
   search = input.nextLine();

   for (int j = 0; j < courses.length - 1; j++)
    {
     if(courses[j][i].equals(search))
      {
        want = courses[j][i+1];
      }
      }
      }
     else if(i == 1)
      {

    System.out.println("Enter the time you would like to see the course for");
    search = input.nextLine();
 
    for (int j = 0; j < courses.length - 1; j++)
    {
      if(courses[j][i].equals(search))
    {
      want = courses[j][i-1];
    }
    }
    }
      if(want.equals(" "))
    {


     System.out.println("What you searched for does not exist.");
    }
     else
     {
     System.out.println("What you searched for " + search);
      System.out.println("What you want " + want);
     }
   }
}

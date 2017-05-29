import java.util.*;
public class RecordingSort
{
 public static void main(String arg[])
 {
  Scanner input = new Scanner(System.in);
  Recording[] music = new Recording[3];

  for(int i = 0; i < music.length; i++)
   {
     music[i] = new Recording();
     System.out.println("Enter Artist Name: ");
     music[i].setArtist(input.nextLine());

     System.out.println("Enter Song Name: ");
     music[i].setTitle(input.nextLine());
     
     System.out.println("Enter Song Length in seconds: ");
     music[i].setseconds(input.nextInt());
     input.nextLine();
   }

   System.out.println("Would you like to sort by Artist (1) , Song Title (2) , or Length (3) ? ");
   int choice = input.nextInt();
   
   Recording temp = new Recording();
   if(choice == 1)
   {
     for(int j= 0; j < music.length - 1; j++)
   {

     for(int i = 0; i < music.length - 1; i++)
   {
     if(music[i].getArtist().compareTo(music[i + 1].getArtist()) > 0)
   {
     temp = music[i];
     music[i] = music[i + 1];
     music[i + 1] = temp;
   }
   }
   }
   }
  
   else if(choice == 2)
   {
     for(int j= 0; j < music.length - 1; j++)
   {
     for(int i = 0; i < music.length - 1; i++)
   {
     if(music[i].getTitle().compareTo(music[i + 1].getTitle()) > 0)
   {
     temp = music[i];
     music[i] = music[i + 1];
     music[i + 1] = temp;
   }
   }
   }
   }
     else if(choice == 3)
   {
     for(int j= 0; j < music.length - 1; j++)
   {
     for(int i = 0; i < music.length - 1; i++)
   {
      if(music[i].getseconds() > music[i + 1].getseconds())
   {
      temp = music[i];
      music[i] = music[i + 1];
      music[i + 1] = temp;
   }
   }
   }
   }
  
    for(int i = 0; i < music.length; i++)
    {
     music[i].display();
    }
  }
  
}
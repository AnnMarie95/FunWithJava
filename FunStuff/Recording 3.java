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


    
  
 

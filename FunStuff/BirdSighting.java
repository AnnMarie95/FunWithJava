public class BirdSighting

{
  String Species;
  int Numbseen;
  int DayOfYear;
  
  public String getSpecies()
  {
   return Species;
  }
  
  public int getNumbseen()
  {
   return Numbseen;
  }
  
  public int getDayOfYear()
  {
   return DayOfYear;
  }
  
  public BirdSighting()
  {
   Species = "Peacock";
   Numbseen = 3;  
   DayOfYear = 9;
  }
  
  public BirdSighting ( String Species,int Numbseen, int DayOfYear)
  {
   Species = Species;
   Numbseen = Numbseen;
   DayOfYear = DayOfYear;
  }
  
 } 
   
   
   
     
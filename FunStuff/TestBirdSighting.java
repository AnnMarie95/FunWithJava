public class TestBirdSighting
{
 public static void main(String[]args)
 {
  BirdSighting Bird = new BirdSighting();
  System.out.println( Bird.getSpecies());
  System.out.println( Bird.getNumbseen());
  System.out.println( Bird.getDayOfYear());
  
  BirdSighting Bird2 = new BirdSighting( "turkey", 2,13 );
  System.out.println( Bird.getSpecies());
  System.out.println( Bird.getNumbseen());
  System.out.println( Bird.getDayOfYear());
  
  }
  
 }
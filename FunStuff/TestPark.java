public class TestPark
{
 public static void main(String[]args)
  {
   Park Pk = new Park();
   Park Bigger = new Park();
   Pk.sethasPicnic(true);
   Pk.sethasPlayground(true);
   Pk.sethasTennis(true);
   Pk.sethasSwimpool(true);
   Park pk1 = new Park();
   pk1.setName("Ranger");
   pk1.setSize(200);
   Park pk2 = new Park();
   pk2.setName("Rosepetals");
   pk2.setSize(400);
   boolean torf = haspicPlay(Pk);
   
   
   //System.out.println(torf2);
   
   int Facs = NumFacilities(Pk);
   System.out.println(Facs);
   
   Park pk = Bigger(pk1, pk2);
   System.out.println(pk.getName());
   
   
   
  // torf = hasReq(Pk, false, true, false, false);
   torf = hasExAll(Pk, true, false, false, false);
   System.out.println(torf);
  }
  
  public static boolean haspicPlay(Park Pk)
  {
  if(Pk.gethasPicnic() && Pk.gethasPlayground())
      return true;
      else
       return false;
    }
      
 public static boolean hasReq(Park Pk, boolean hasPicnic, boolean hasPlayground, boolean hasTennis, boolean hasSwimpool)
   {
    boolean torf = false;
     if ( hasPicnic )
       if (Pk.gethasPicnic())
        torf = true;
         else
            {torf = false;
              return torf;}
            
     if ( hasPlayground )
       if (Pk.gethasPlayground())
        torf = true;
          else
            {torf = false;
              return torf;}
                     
      if ( hasTennis )
        if (Pk.gethasTennis())
          torf = true;
            else
              {torf = false;
               return torf;}
                       
      if ( hasSwimpool )
        if (Pk.gethasSwimpool())
           torf = true;
             else
               {torf = false;
                 return torf;}
              
       return torf;
   }
      
      
public static boolean hasExAll(Park Pk, boolean hasPicnic, boolean hasPlayground, boolean hasTennis, boolean hasSwimpool)
      {
        boolean torf = hasReq(Pk, hasPicnic,  hasPlayground,  hasTennis,  hasSwimpool);
        
        if(! torf )
         {
          return false;
          }
          
        if(! hasPicnic)
           {
            if(Pk.gethasPicnic())
               return false;
            else
               return torf = true;
               } 
               
          if(! hasPlayground)
           {
            if(Pk.gethasPlayground())
               return false;
            else
               return torf = true;
               }
            
          if(! hasTennis)
           {
            if(Pk.gethasTennis())
               return false;
            else
               return torf = true;
               }
               
           if(! hasSwimpool)
           {
            if(Pk.gethasSwimpool())
               return false;
            else
               return torf = true;
               } 
           System.out.println("I am in hasExAll torf = " + torf );
           return torf;
           //System.out.println("I am in hasExAll torf = " + torf );
    
         
          }
     
     
      public static int NumFacilities(Park Pk)
    {
     int Facs = 0;
     
     if(Pk.gethasPicnic())
     {
      Facs = Facs + 1; 
     }
     
     if (Pk.gethasPlayground())
     {
      Facs = Facs + 1;
     }
     
     if (Pk.gethasTennis())
     {
      Facs = Facs + 1;
     }
     
     if (Pk.gethasSwimpool())
     {
      Facs = Facs + 1;
     }
    return Facs;
   }
 
   public static Park Bigger( Park pk1, Park pk2)
    { 
      if( pk1.getSize() > pk2.getSize() )
        return pk1;
         else
          return pk2;
                   
     } 
            
    }
   
   
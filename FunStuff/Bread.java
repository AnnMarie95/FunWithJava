public class Bread
{
 private String BreadType;
 private int CalsPerSlice;
 public final static String MOTTO = "The Staff Of Life";
   

 
   public Bread(String BT, int CPS)
  {
   BreadType = BT;
   CalsPerSlice = CPS;
  }

   public String getBreadType()
   {
    return BreadType;
   }  
   
   public int getCalsPerSlice()
   {
   return CalsPerSlice;
   }
   
 
 }
   
   
   
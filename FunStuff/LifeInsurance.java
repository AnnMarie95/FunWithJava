public class LifeInsurance extends Insurance
{
   private String beneficiary;
   private int yearBorn;
   
   public void setLife(int polnumber, String name,double amount,double premium,String b,int y)
   {
      kind = LIFE;
      this.polnumber = polnumber;
      this.name = name;
      this.amount = amount; 
      this.premium = premium;
      beneficiary = b;
      yearBorn = y;
      
    }// end of setHome
    
    public String getBeneficiary()
    {
      return beneficiary;
    }//end of getBen
    
    public int getYear()
    {
      return yearBorn;
    }// end of getYear
      
    
}
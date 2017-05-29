public class HomeInsurance extends Insurance
{
   private double homeDeduct;
   private int yearBuilt;
   
   public void setHome(int polnumber,String name, double amount,double premium, double home, int year)
   {
      kind = HOME;
      this.polnumber = polnumber;
      this.name = name;
      this.amount = amount;
      this.premium = premium;
      homeDeduct = home;
      yearBuilt= year;
      }
   public double getDeduct()
   {
      return homeDeduct;
   }
   public int getYear()
   {
      return yearBuilt;
   }
}
       
      
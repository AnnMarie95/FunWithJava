public class Invoice
{
  int IN;
  double Baldue;
  int M;
  int Dy;
  int Yr;
 
 public Invoice ( int InvoiceNumber, double  Balancedue, int Month, int Day, int Year)
 {
 
/* Scanner Input = new Scanner(System.in);
    System.out.println ("Please enter option");
    InvoiceNumber = Input.nextInt();*/


  
   IN = InvoiceNumber;
    if (InvoiceNumber < 1000 )
          IN = 0;
    /*System.out.println( "Please enter invoice number" );
    InvoiceNumber = Input.nextInt();*/


         
   Baldue = Balancedue;
   
   M = Month;
    if (Month < 1 || Month > 12 )
         M = 0;
    /*System.out.println( "Please enter month" );
    InvoiceNumber = Input.nextInt();*/


   
   Dy = Day;
    if (Day < 1 || Day > 31)
         Dy = 0;
    
    

    
   Yr = Year;
    if (Year < 2011 || Year > 2017)
         Yr = 0;
      
      
      
   }
   
 }
   
      
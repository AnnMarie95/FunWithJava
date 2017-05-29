public class Perfect
{
 public static void main(String[] args)
 {
   int val;
   int num;
   int sum;
   
   for(val = 1; val < 1001; val++)
   {
     sum = 0;    
   
   for ( num = 1; num < val; ++num)
        
            if(val%num == 0)
           
                sum+=num;
           if(sum==num)
             System.out.println(val);
    
   }
  }
  
}
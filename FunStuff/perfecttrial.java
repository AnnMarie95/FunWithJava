
import java.util.*;
class perfect
{
    public static void main(String[] args)
    {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\nEnter a number:");
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum = sum + i;
            }
        }
        if(sum == n)
            System.out.println("\nGiven number is a perfect number");
        else
            System.out.println("\nGiven number is not perfect number");
    }
}
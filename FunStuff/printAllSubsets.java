import java.util.*;

public static main(int[] arr) 
{
    byte[] counter = new byte[arr.length];

      for (int i = 0; i < counter.length; i++)
       {
        if (counter[i] != 0)
          System.out.print(arr[i] + " ");
      }
      System.out.println();

   
      int i = 0;
      while (i < counter.length && counter[i] == 1)
        counter[i++] = 0;
      if (i == counter.length)
        break;
      counter[i] = 1;
    }
  }
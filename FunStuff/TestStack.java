import java.util.*;
public class TestStack
{
  public static void main(String args[])
  {
   Stack s = new Stack();
   s.push(11);  
   s.push(22);
   s.push(33);
   s.push(44);
   s.push(55);
   s.push(66);
   s.push(77);
   s.push(88);
   s.push(99);
   s.push(111);

   Stack t = new Stack();
 
      
   if (!s.empty())
   {
    s.pop();
   
    System.out.println("a = " + s.peek());
   
  }
  
  if (!s.empty())
  {
    int i = s.pop();
    int j = s.pop();
    int k = s.peek();
    
    System.out.println("b = " + k);
    s.push(i);
    s.push(j);
    

     
   }
    
   int x = 1111;
   
   if(!s.empty())
   {
      int n = 3;
      for (int i = 0; i < n; i++)
      {
         x = s.pop();
      }
      
      System.out.println( "c = " + x);
    
   }    
   
   if(!s.empty())
   {
      int n = 3;
      for(int i = 0; i < n; i++);
      {
         int l=s.pop(); 
         int m =s.pop(); 
         int o =s.pop(); 
         System.out.println("d = "+ o); 
         s.push(o); 
         s.push(m);
         s.push(l); 
         }
         
         }
         
       int i = 1111; 
       while(!s.empty()) 
       {
          
         while(!s.empty())
          { 
            i = s.pop(); 
          } 
          
        System.out.println("e = " + i);
        
      }
      
       while(!s.empty())  
        { 
           i = s.pop(); 
           t.push(s.pop()); 
       } 
        System.out.println("f = " + i);
      
        
      s.push(11);  
      s.push(22);
      s.push(33);
      s.push(44);
      s.push(55);
      s.push(66);
      s.push(77);
      s.push(88);
      s.push(99);
      s.push(111);
 
      
   while(!s.empty()){
      i = s.pop();
      t.push(i);
   }
   
    int n= 1;
    while(!t.empty())
    {
     if (n++==3)
     i = t.peek();
     s.push(t.pop());
    }
    
    System.out.println("g = " + i);
    
   }
 }

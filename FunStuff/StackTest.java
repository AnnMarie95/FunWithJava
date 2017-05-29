public class StackTest
{
  public static void main(String args[])
  {
   Stack s = new Stack();
   s.push(10);  
   s.push(20);
   s.push(30);
   s.push(40);
   s.push(50);
   s.push(60);
   s.push(70);
   s.push(80);
   s.push(90);
   s.push(100);

   Stack t = new Stack();
 
 //a     
   if (!s.empty())
   {
    s.pop();
    int i = s.pop();
    System.out.println("a:i = " +i);
   
  }
   //b

if (!s.empty())
   {
      int j = s.pop();
      int i = s.pop();
      System.out.println("b:i = "+i);
      s.push(i);
      s.push(j);
   }
   //c
   
   
   int x = 9999;
if (!s.empty())
   {
      int n = 3;
      for(int k=0; k< n; k++)
      {
         x = s.pop();
      }
      System.out.println("c:n = "+x);
  }
  //d

if (!s.empty())
{
   int n = 3;
   
 for(int k=0; k< n; k++)
 {
   int l=s.pop();
   int h =s.pop();
    int p =s.pop();
   System.out.println("d:n = "+x);
   s.push(p);
   s.push(h);
   s.push(l);
   break;
   }
   //e'
  
  
  int i =9999;
  while(!s.empty())
  {
    i = s.pop();
   }
   System.out.println("e:i = "+i);

   //f
   
  

while(!s.empty()) 
  {
   i = s.pop();
   t.push(s.pop());
   
  }
   System.out.println("f:i = "+i);
   //g
   
   

   s.push(10);  
   s.push(20);
   s.push(30);
   s.push(40);
   s.push(50);
   s.push(60);
   s.push(70);
   s.push(80);
   s.push(90);
   s.push(100);

while(!s.empty())
{
   i = s.pop();
   t.push(i);
  }
   
     n= 1;
    while(!t.empty())
    {
    if (n++==3)
      i = t.peek();
      s.push(t.pop());
    }
      
      System.out.println("g:i = " +i);

   
   
      
 }
  
  
   
   
   
  }//end of main
}//end of class
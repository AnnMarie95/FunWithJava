public class Stack
{
 private final int STACKSIZE = 10;
 private int top;
 private int[] items;
 
 public Stack()
 {
   items = new int[STACKSIZE];
   top = -1;
 }
 
 public boolean empty()
 {
   if (top == -1)
      return true;
     else
         return false;
  }
    
   public int pop() 
   {
      if (empty())
      {
         System.out.println("stack underflow");
         System.exit(1);
      }
    return items[top--];
   }
   
   public void push(int x)
   {
      if (top == STACKSIZE -1)
      {
         System.out.println("Stack overflow");
         System.exit(1);
       }
         items[++top] =x;
     }
   public int peek()
   {
      if (empty())
      {
         System.out.println("stack underflow");
         System.exit(1);
       }
       return items[top];
   

      
        }
       
}
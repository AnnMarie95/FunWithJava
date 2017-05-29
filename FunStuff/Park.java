public class Park
{

 String Name;
 int Size;
 
 boolean hasPicnic;
 boolean hasTennis;
 boolean hasPlayground;
 boolean hasSwimpool;
 
  public String getName()
   {
    return Name;
   } 
   
   public void setName(String Nm)
   {
    Name = Nm;
   }
   
   public int getSize()
   {
    return Size;
   }
   public void  setSize(int Sz)
   {
    Size = Sz;
   if (Sz < 0 || Sz > 400)
      Sz = 0;
   }
   
   public boolean gethasPicnic()
   {
    return hasPicnic;
   }
   public void sethasPicnic(boolean Pic)
   {
    hasPicnic = Pic;
   }
   
   public boolean gethasTennis()
   {
    return hasTennis;
   }
   public void sethasTennis(boolean Ten)
   {
    hasTennis = Ten;
   }
   
   public boolean gethasPlayground()
   {
    return hasPlayground;
   }
   public void sethasPlayground(boolean Plyground)
   {
    hasPlayground = Plyground;
   }
   
   public boolean gethasSwimpool()
   {
    return hasSwimpool;
   }
   public void sethasSwimpool(boolean Pool)
   {
    hasSwimpool = Pool; 
   } 
    
    }
   
   
     

 


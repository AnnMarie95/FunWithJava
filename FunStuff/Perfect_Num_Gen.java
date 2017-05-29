
public class Perfect_Num_Gen 
{ 
public static void main(String [] args) 
{ 
int calc = 0; int rem = 0; 
for(int i = 1; i < 500; i++) 
{ 
for(int j = 1; j < i; j++) 
{ 
rem = i % j; 
if(rem == 0) 
calc = calc + i; 
} 
if(calc == i) 
{ 
System.out.println("This number " + i + " is a perfect number."); 
} 
calc = 0; 
} 
} 
} 

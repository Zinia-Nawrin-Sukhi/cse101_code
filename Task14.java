import java.util.Scanner;
 public class Task14
 {
  public static void main (String[]arges)
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("please enter a number");
   int num= sc.nextInt();
   if(num%2==0)
   {
    if(num>10)
    {
     System.out.println("An even number greater than 10");
    }
    else 
    {
      System.out.println("An even number but lesser than 10");
    }
      
    }
    else 
    {
      if (num>10)
      {
      System.out.println("An odd number greater than 10 ");
      }
      else 
      {
        System.out .println("an odd number but lesser than 10");
      }
        
     
   }
  } 
 }  
    
    
    
    
    
    
  
   
   
   
   
   
   

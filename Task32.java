import java.util.Scanner;
public class Task32
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    int p;
    System.out.println("please enter a value");
   int Q=sc.nextInt();
   
    if(Q<=500)
    {
      
      p=6000+(15*(Q*Q));
     
     
    }
    else
    {
     p=1000/(3+(Q*Q)/1900);
   
    }
     System.out.println(p);
  }
}
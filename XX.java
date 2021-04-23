import java.util.Scanner;
public class Q1
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    int i=1;
   while(i<=10)
   {
      int digit=0;
      System.out.println("please enter a number");
    int n=sc.nextInt();
   while(n>0)
    {
      if(n>=100)
      {
        int m=n%100;
        digit=m%10;
        System.out.println(digit);
        int z=m/10;
        System.out.println(z);
    n=n/100;
      }
      else{
     
        if(n>=10 && n<100)
        {
          digit=n%10;
          System.out.println(digit);
    n=n/10;
        }
       else
        {
        System.out.println(n);
        n=n/10;
        }
        
        }
       
   
       
    }
   i++;
   }  
  
  }
}

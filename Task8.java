import java.util.Scanner;

public class Task8 
{
  public static void main (String [] arges)
  {
     
  Scanner sc=new Scanner(System.in);
     System.out.println("Please enter a number");
     int num1= sc.nextInt();
     System.out.println("please enter a number");
     int num2 =sc.nextInt();
      if (num1>num2) 
      {
       System.out.println("first is greaer");
      }
      else if (num2>num1)
      {
        System.out.println("second is greater");
      }
      else
      {
         System.out.println("the numbers are equal");
         }
}
}
       
       
       
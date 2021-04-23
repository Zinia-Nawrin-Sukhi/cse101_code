import java.util.Scanner;

public class Task4
{
  public static void main (String [] arges)
  {
     
  Scanner sc=new Scanner(System.in);
     System.out.println("Please enter a number");
     int num1=sc.nextInt();
     System.out.println("please enter a number");
     int num2=sc.nextInt();
     int sum = num1+num2;
     int product = num1*num2; 
      int difference = num1-num2; 
       System.out.println (sum);
     System.out.println(product);
     System.out.println(difference);
  }
}
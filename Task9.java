import java.util.Scanner;

public class Task9
{
  public static void main (String [] arges)
  {
     
  Scanner sc=new Scanner(System.in);
     System.out.println("Please enter a number");
     int num1= sc.nextInt();
     System.out.println("please enter another number");
     int num2=sc.nextInt();
     int difference ;
     if(num1>num2)
     {
       difference=num1-num2;
    
     }
     else
     {
       difference=num2 - num1;
     }
  System.out.println(difference);

}
}
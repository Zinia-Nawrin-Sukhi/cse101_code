import java.util.Scanner;
public class Task26
{
  public static void main(String[]arges)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("please enter hours");
   int hours=sc.nextInt();
    
    if(hours<=40)
    {
      int salary=(200*hours);
      System.out.println(salary);
    }
      
    else
    {
       int salary=800+(300*(hours-40));
    
  
    System.out.println(salary);
    }
    
  }
}
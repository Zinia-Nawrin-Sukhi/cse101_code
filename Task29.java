import java.util.Scanner;
public class Task29
{
  public static void main (String[]arges)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("please enter value of x");
    double x=sc.nextDouble();
    System.out.println("please enter value of y");
    double y=sc.nextDouble();
    System.out.println("please enter value of z");
    double z=sc.nextDouble();
    double s=(x+y+z)/2;
    double area=Math.sqrt(s*(s-x)*(s-y)*(s-z));
    System.out.println(area);
    
  }
}
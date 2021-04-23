  import java.util.Scanner;
  public class Task11
{
    public static void main(String[]arges)
  {
    Scanner sc =new Scanner(System.in);
    System.out.println("please enter a number");
    int num1=sc.nextInt();
    System.out.println("please enter a number");
    int num2=sc.nextInt();
    System.out.println("please enter a number");
    int num3=sc.nextInt();
    System.out.println("please enter a number");
    int num4=sc.nextInt();
    System.out.println("please enter a number");
    int num5=sc.nextInt();
    int sum=(num1+num2+num3+num4+num5);
    int average=(sum/5);
    System.out.println(average);
  }
}
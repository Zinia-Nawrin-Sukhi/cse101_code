import java.util.Scanner;
public class Task27
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("please enter seconds");
    int time= sc.nextInt();
    int hour=time/3600;
    int reminder=time%3600;
    int minute=reminder/60;
    int second=reminder%60;
    System.out.println(hour+"hours");
     System.out.println(minute+"minutes");
      System.out.println(second+"seconds");
    
  }
}
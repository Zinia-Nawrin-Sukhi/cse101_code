import java.util.Scanner;
public class Task23
{
  public static void main(String[]arges)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("please enter height");
    int height=sc.nextInt();
    System.out.println("please enter width");
    int width=sc.nextInt();
    int area=height*width;
 
    System.out.println(area);
  }
}
import java.util.Scanner;
  public class Task28
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner (System.in);
      System.out.println("please enter value");
      int s=sc.nextInt();
      int l;
      if(s>100)
      {
        l=(1200/4)+((s*s)/14900);
      }
      else
      {
        l=300-(125*(s*s));
      }
      System.out.println(l);
    }
  }
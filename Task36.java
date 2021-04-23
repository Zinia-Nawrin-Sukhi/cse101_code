import java.util.Scanner;
public class Task36
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
      System.out.println("please enter grade1");
    int grade1=sc.nextInt();
     System.out.println("please enter grade2");
    int grade2=sc.nextInt();
     System.out.println("please enter grade3");
    int grade3=sc.nextInt();
     System.out.println("please enter grade4");
    int grade4=sc.nextInt();
    int gpa=(grade1*3+grade2*0+grade3*3+grade4*3)/(3+0+3+3);
    System.out.println(gpa);
  }
}
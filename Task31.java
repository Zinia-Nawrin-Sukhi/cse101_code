import java.util.Scanner;
public class Task31
{
  public static void main(String[]arges)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("please enter course number");
    int A=sc.nextInt();
     System.out.println("please enter credit number");
    int B=sc.nextInt();
     System.out.println("please enter credit cost");
    int C=sc.nextInt();

   int payment=A*B*C;
    System.out.println(payment);
    
    
    
  }
}
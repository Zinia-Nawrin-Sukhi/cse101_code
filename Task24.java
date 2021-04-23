import java.util.Scanner;
public class Task24
{
  public static void main(String[]arges)
  {
    Scanner sc=new Scanner(System.in);
      System.out.println("please enter a number");
    double num1=sc.nextDouble();
    System.out.println("please enter a number");
    double num2=sc.nextDouble();
    System.out.println("please enter an operator");
    String operator=sc.next();
    double result=0;
    if(operator.equals("+"))
    {
      result = num1+num2;
    }
    else if(operator.equals("-"))
    {
      result=num1-num2;
      
    }
    else if(operator.equals("*"))
    {
      result=num1*num2;
    }
    else
    {
      result=num1/num2;
    }
    System.out.println(result);
  }
}
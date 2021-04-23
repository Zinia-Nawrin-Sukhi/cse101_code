import java.util.Scanner;

public class Task5
{
  public static void main (String [] arges)
  {
     
  Scanner sc=new Scanner(System.in);
     System.out.println("Please enter radius");
    double radius= sc.nextDouble();
    double circumference=2*3.1416*radius;
    double area =3.1416*radius*radius;
    System.out.println(circumference);
      System.out.println(area);
  }
}
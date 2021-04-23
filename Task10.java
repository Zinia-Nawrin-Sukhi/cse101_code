mport java .util.Scanner;
  public class Task10
{
  public static void main (String []arges)
                             
  {
   Scanner sc =new Scanner(System.in);
   System.out.println("please enter a number");
   int number=sc.nextInt();
   if (number%2 == 0)
   {
     System.out.println("The number is even" );
   }
   else
   {
     System.out.println( "The number is odd" );
   }
   
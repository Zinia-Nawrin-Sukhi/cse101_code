  import java.util.Scanner;
  public class Task25
  {
    public static void main(String[]arges)
    {
      Scanner sc= new Scanner(System.in);
        
      System.out.println("please enter your age");
      int age=sc.nextInt();
      if(age==18)
      {
        System.out.println("no tax");
      }
      else 
      {
        System.out.println("please enter your post");
        String post=sc.next();
        String president=sc.next();
        if(post.equals("president"))
        {
          System.out.println("no tax");
        }
        else
        {
         System.out.println("please enter your salary");
         double salary=sc.nextDouble();
         double tax=sc.nextDouble();
         if(salary<10000)
         {
           System.out.println("no tax");
         }
         else
         {
           if(salary>=20000)
           {
             tax=salary*(10.0/100.0);
           }
           else
           {
             tax=salary*(5.0/100.0);
           }
           System.out.println(tax);
         }
        }
      }
    }
  }
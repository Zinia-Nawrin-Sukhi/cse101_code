import java.util.Scanner;
public class Task34
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("please enter duration");
    int duration=sc.nextInt();
    System.out.println("please enter type");
   String type=sc.next();
   System.out.println("please enter time");
    String time=sc.next();
    int rate;
    if(type.equals("F&F"))
    {
    if(time.equals("peak"))
    {
      if(duration>=5)
      {
        rate=5*4+(duration-5)*2;
      }
      else
      {
        rate=duration*4;
      }
    }
      else
      {
        if(duration>=5)
        {
          rate=3*5+(duration-5)*1;
        }
        else
        {
          rate=duration*3;
        }
      }
    }
        else
        {
          if(time.equals("peak"))
          {
            if(duration>=5)
            {
              rate=5*8+(duration-5)*5;
            }
            else
            {
              rate=duration*8;
            }
          }
            else
            {
              if(duration>=5)
              {
                rate=5*7+(duration-5)*6;
              }
              else
              {
                rate=duration*7;
              }
              
            }
            System.out.println(rate);
          }
        }
}
        
     
      
 
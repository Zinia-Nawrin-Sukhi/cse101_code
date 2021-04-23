import java.util.Scanner;
public class task35 {
 
 public static void main(String []arges) {
  Scanner sc = new Scanner(System.in);
  System.out.println("Please give me the time ");
  int fnum = sc.nextInt();
  if(fnum<0 || fnum>23) {
   
   System.out.println("WRONG TIME");
  }
  else if(fnum>=4 || fnum<=6) {
   System.out.println("BREAKFAST");
  }
   
   
  
  else if(fnum>=12 || fnum<=13) {
   System.out.println("LUNCH");
   
   
   
  }
  else if(fnum>=16 || fnum<=17) {
   System.out.println("SNACKS");
   
   
   
  }
  else if(fnum>=19 || fnum<=20) {
   System.out.println("Dinner");
   
   
   
  }
  else {
   
   System.out.println("Patience is a virtue");
  }
  
  
  
 }

}


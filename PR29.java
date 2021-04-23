import java.util.Scanner;

public class PR29

{

  public static void main(String[]args){

  Scanner x=new Scanner(System.in);

  System.out.println("Value of side X");

  double a;

  a=x.nextDouble();

  Scanner y=new Scanner(System.in);

  System.out.println("Value of side Y");

  double b;

  b=y.nextDouble();

  Scanner z=new Scanner(System.in);

  System.out.println("Value of side Z");

  double c;

  c=z.nextDouble();



  double s=((a+b+c)/2);

  double Area=Math.sqrt(s*(s-a)*(s-b)*(s-c));

    System.out.println(Area);

  }}
Bappi
Try this
Tajish
ok
thik ase
Kichu
34&35 krchn keu
??
Bappi
Amr ekhn o hoy ni
33 porjonto done
Kichu
34 nd 35 hole diyen..
Bappi
Guys ai problem ta keu solve korte parba?? 

***Draw a flowchart to find all the roots of a triangular equation a^2+b^2=c^2..
And write the java code...
Kichu
I guess ata Math.pow diya krte hobe
Bappi
Hm.. bt flowchart ki vabe korbo ?
Mon 5:40am
Tajish
Easy to
Input niba
Then protek ta input er niche square box input*input korba
Then last a oigula sum
Oe na
Pera ase?
Mon 4:39pm
Accha page er both side ki use Kora jabe
Raiyad
yup
jbe
Okk
Mon 8:10pm
Raiyad
kew 13 num ta ektu dite parba
amar tay ektu problem hoitase
Mon 11:09pm
Bappi
Wait
Dicchi
Bappi
import java.util.Scanner;

public class PR13

{

  public static void main(String[]args){

  Scanner x=new Scanner(System.in);

  System.out.println("Enter first number");

  double a;

  a=x.nextDouble();

   Scanner y=new Scanner(System.in);

  System.out.println("Enter second number");

  double b;

  b=y.nextDouble(); 

  Scanner z=new Scanner(System.in);

  System.out.println("Enter third number");

  double c;

  c=z.nextDouble(); 

  Scanner j=new Scanner(System.in);

  System.out.println("Enter forth number");

  double d;

  d=j.nextDouble();

  Scanner k=new Scanner(System.in);

  System.out.println("Enter fifth number");

  double e;

  e=k.nextDouble();



  if(a%2==0)

  {

    System.out.println("The number is even");

  }

  else

  {

  System.out.println("The number is odd");

  }

  

  if(b%2==0)

  {

    System.out.println("The number is even");

  }

  else

  {

  System.out.println("The number is odd");

  }

  if(c%2==0)

  {

    System.out.println("The number is even");

  }

  else

  {

  System.out.println("The number is odd");

  }

  if(d%2==0)

  {

    System.out.println("The number is even");

  }

  else

  {

  System.out.println("The number is odd");

  }

  if(e%2==0)

  {

    System.out.println("The number is even");

  }

  else

  {

  System.out.println("The number is odd");

  }

  

  

  

  }}
Bappi
@Raiyad Alam
?1
Bappi
Anyone interested to join in group study tomorrow at 12?
Raiyad
okay brother but kothay korba
library
Bappi
Library?
Raiyad
kora jay
amar kisu problem  ase solve kore diyo
Bappi
Group a solve korbo
Raiyad
accha
Tue 4:36pm
Nadia
Amaretto section koto ?
Amader *
Humayera
9
Tue 5:47pm
Tajish
akta help dorkar
35 er eta hoise ki na aktu dekho guys
Tajish
import java.util.Scanner;
public class task35 {
 
 public static void main(String args[]) {
  Scanner lol = new Scanner(System.in);
  System.out.println("Please give me the time: ");
  int fnum = lol.nextInt();
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
   System.out.println("SNACKS");
   
   
   
  }
  else {
   
   System.out.println("Patience is a virtue");
  }
  
  
  
 }

}
Chat Conversation End
Type a message, @name...


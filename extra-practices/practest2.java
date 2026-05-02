// Author: Muhammad Ammar bin Azizan
// GitHub: https://github.com/muhdammar-azizan
// Calculate monthly salary including commission based on number of car sales.

//PRACTICAL TEST 2
import java.util.Scanner;
class practest2{
   public static void main(String[]args){
      Scanner read=new Scanner(System.in);
      String month,name;
      int car;
      double comm,total;
   
      System.out.println("++++++ Jaya Car Sdn.Bhd ++++++");
      System.out.println("++++++ Pay slip ++++++");
   
      System.out.print("Month : ");
      month=read.nextLine();
   
      System.out.print("Worker Name : ");
      name=read.nextLine();
   
      System.out.print("Numbers of car sale for this month : ");
      car=read.nextInt();
   
      System.out.println("-------------------------------------------");
   
      System.out.println("Basic Salary   : RM 2000");
   
      if (car>=10)
         comm=200*car;
      
      else if (car>=5)
         comm=150*car;
      
      else
         comm=100*car;
   
      total=2000+comm;
      System.out.println("Commission     : RM "+comm);
      System.out.print("Total salary   : RM "+total);
   }
}
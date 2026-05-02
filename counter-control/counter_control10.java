// Author: Muhammad Ammar bin Azizan
// GitHub: https://github.com/muhdammar-azizan

//Average temperature for a certain number of days
import java.util.Scanner;
class counter_control10{
   public static void main (String[]args){
      Scanner read=new Scanner(System.in);
      double totaltemp=0,avgtemp;
      int c,day;
   
      System.out.print("Enter number of days=");
      day=read.nextInt();
   
      c=1;
      while (c<=day){
         System.out.print("Enter daily average temperature for day  "+c +"=");
         avgtemp=read.nextDouble();
      
         totaltemp+=avgtemp;
         c++;
      }
      System.out.print("Total temperature="+totaltemp);
   
   }}
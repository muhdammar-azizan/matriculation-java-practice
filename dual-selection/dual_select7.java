// Author: Muhammad Ammar bin Azizan
// GitHub: https://github.com/muhdammar-azizan

/*First 12 hours=RM100/hour
   Additional hour=RM50/hour*/
import java.util.Scanner;
class dual_select7{
   public static void main (String[]args){
      Scanner read=new Scanner(System.in);
      double hour,allowance;
   
      System.out.print("enter hour=");
      hour=read.nextDouble();
   
      if (hour<=12)
         allowance=100*hour;
      
      else
         allowance=50*(hour-12)+1200;
   
      System.out.print("Allowance=RM"+ allowance);
   }}
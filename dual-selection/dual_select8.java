// Author: Muhammad Ammar bin Azizan
// GitHub: https://github.com/muhdammar-azizan

/*1000watt=20cents/watt
  additional watt=10cents/watt*/
import java.util.Scanner;
class dual_select8{
   public static void main(String[]args){
      Scanner read=new Scanner(System.in);
      double watt,bill;
   
      System.out.print("enter watt=");
      watt=read.nextDouble();
   
      if (watt<=1000)
         bill=watt*0.2;
      
      else 
         bill=200+0.1*(watt-1000);
   
      System.out.print("Bill=RM"+bill);
   }}
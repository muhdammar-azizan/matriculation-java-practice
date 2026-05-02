// Author: Muhammad Ammar bin Azizan
// GitHub: https://github.com/muhdammar-azizan

/*Rents car RM60 for 24hours and RM5 for additional hour*/
import java.util.Scanner;
class dual_select6{
   public static void main(String[]args){
      Scanner read=new Scanner(System.in);
      int hour,charge;
   
      System.out.print("enter hour=");
      hour=read.nextInt();
   
      if (hour<=24)
         charge=60;
      
      else
         charge=60+5*(hour-24);
   
      System.out.print("The charge="+ charge);
   }}
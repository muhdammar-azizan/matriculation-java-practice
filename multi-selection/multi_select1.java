// Author: Muhammad Ammar bin Azizan
// GitHub: https://github.com/muhdammar-azizan

/*Number entered is positive , negative or zero*/
import java.util.Scanner;
class multi_select1{
   public static void main(String[]args){
      Scanner read=new Scanner(System.in);
      double number;
   
      System.out.print("enter number=");
      number=read.nextDouble();
   
      if (number>0)
         System.out.print("The number is positive");
      
      else if (number<0)
         System.out.print("The number is negative");
      
      else
         System.out.print("The number is zero"); 
   }}
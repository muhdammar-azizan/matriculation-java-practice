// Author: Muhammad Ammar bin Azizan
// GitHub: https://github.com/muhdammar-azizan

//Accepts a series of numbers and determine whether number odd or even until user enter 0
import java.util.Scanner;
class sentinel_control5{
   public static void main(String[]args){
      Scanner read=new Scanner (System.in);
      double number;
   
      System.out.print("Enter number=");
      number=read.nextDouble();
   
      while (number!=0){
      
         if (number%2==0)
            System.out.println("even number");
         
         else
            System.out.println("odd number");
      
         System.out.print("Enter number=");
         number=read.nextDouble();
      }
   }}

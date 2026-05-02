// Author: Muhammad Ammar bin Azizan
// GitHub: https://github.com/muhdammar-azizan
// Compare two numbers to determine whether one is larger, smaller, or equal.
import java.util.Scanner;
class multi_select9{
   public static void main(String[]args){
      Scanner read=new Scanner(System.in);
      double number1,number2;
   
      System.out.print("Enter number1=");
      number1=read.nextDouble();
   
      System.out.print("Enter number2=");
      number2=read.nextDouble();
   
      if (number1>number2){
         System.out.println("number2 smaller than number1");
         System.out.print("number1 larger than number2");
      }
      
      else if (number1<number2){
         System.out.println("number1 smaller than number2");
         System.out.print("number2 larger than number1");
      }
      
      else
         System.out.print("The numbers are equal");
   }}

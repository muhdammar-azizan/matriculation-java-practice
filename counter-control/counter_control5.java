// Author: Muhammad Ammar bin Azizan
// GitHub: https://github.com/muhdammar-azizan

/*The sum of 1000 numbers*/
import java.util.Scanner;
class counter_control5{
   public static void main(String[]args){
      Scanner read=new Scanner(System.in);
      double number,sum=0;
      int c;
      
      System.out.print("Enter 1000 numbers=");
   
      c=1;
      while (c<=1000){
         number=read.nextDouble();
         
         sum+=number;
         c++;
      }
      System.out.print("The sum="+sum);
   }}
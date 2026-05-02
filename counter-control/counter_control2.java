// Author: Muhammad Ammar bin Azizan
// GitHub: https://github.com/muhdammar-azizan

/*Print the squares of 10 numbers*/
import java.util.Scanner;
class counter_control2{
   public static void main(String[]args){
      Scanner read=new Scanner(System.in);
      double number,square;
      int c;
   
      c=10;
      while (c>1){
         System.out.print("Enter number=");
         number=read.nextDouble();
      
         square=number*number;
      
         System.out.println("The square is="+square);
         c=c-1;
      }
   }}
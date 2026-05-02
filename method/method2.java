// Author: Muhammad Ammar bin Azizan
// GitHub: https://github.com/muhdammar-azizan
// Calculate sum of two integers using a method with user input.

import java.util.Scanner;
class method2{
   public static void main(String[]args){
   
      int sum=calc();
      System.out.print("The total= "+sum);
   }
   static int calc(){
      Scanner read=new Scanner(System.in);
      int a,b,c;
   
      System.out.print("Enter number 1= ");
      a=read.nextInt();
      System.out.print("Enter number 2= ");
      b=read.nextInt();
   
      c=a+b;
      return c;
   }
}
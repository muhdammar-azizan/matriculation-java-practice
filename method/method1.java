// Author: Muhammad Ammar bin Azizan
// GitHub: https://github.com/muhdammar-azizan
// Calculate sum of two integers using a void method.

import java.util.Scanner;
class method1{
   public static void main(String[]args){
      Scanner read=new Scanner(System.in);
      int num1,num2;
   
      System.out.print("Enter number 1= ");
      num1=read.nextInt();
      System.out.print("Enter number 2= ");
      num2=read.nextInt();
   
      Sum(num1,num2);
   }
   static void Sum(int a,int b){
      int c;
      c=a+b;
      System.out.print("The total= "+c);
   }
}
// Author: Muhammad Ammar bin Azizan
// GitHub: https://github.com/muhdammar-azizan
// Calculate sum and average of two integers using a method.

import java.util.Scanner;
class method3{
   public static void main(String[]args){
      Scanner read=new Scanner(System.in);
      int num1,num2;
   
      System.out.print("Integer 1= ");
      num1=read.nextInt();
      System.out.print("Integer 2= ");
      num2=read.nextInt();
   
   
      int ans=sum(num1,num2);
      int avg=ans/2;
      System.out.println("The sum = "+ans);
      System.out.print("The average = "+avg);
   
   }

   static int sum(int a,int b){
      int total=a+b;
      return total;
   }
}
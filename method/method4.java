// Author: Muhammad Ammar bin Azizan
// GitHub: https://github.com/muhdammar-azizan
// Calculate weekly salary for cook and salesperson using methods and conditional logic.

import java.util.Scanner;
class method4{
   public static void main(String[]args){
      Scanner read=new Scanner(System.in);
      int hour;
      double sales;
   
      System.out.print("Enter cooks hour per week : ");
      hour=read.nextInt();
   
      System.out.print("Enter salesperson total sales per week : RM");
      sales=read.nextDouble();
   
      double salary1=CalcSalaryCook(hour);
      double salary2=CalcSalarySalesPer(sales);
   
      System.out.println("Cook Salary per week : RM"+salary1);
      System.out.print("Salesperson Salary per week : RM"+salary2);
   }

//Position level: cook
   static double CalcSalaryCook(int a){
   
      double cook;
      if (a<=30)
         cook=a*20;
      else 
         cook=600+(a-30)*(1.5*20);
   
      return cook;
   }

//Position level: salesperson
   static double CalcSalarySalesPer(double b){
      double salesper;
      salesper=200+(0.1*b);
      return salesper;
   }
}
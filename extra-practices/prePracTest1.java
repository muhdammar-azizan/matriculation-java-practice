// Author: Muhammad Ammar bin Azizan
// GitHub: https://github.com/muhdammar-azizan
// Calculate monthly net profit after utility costs, worker salaries, and tax deduction.

/*Problem description: The program should be able to calculate net profit for monthly 
sales income. Every month, the company has utility bills that should be paid such as electricity 
and internet subscription lines. The company also needs to pay RM1500 each for three 
workers. Your program will accept month, total sales and utility bills as an input. Calculate 
net profit after 2% tax deduction for that month. Your program should be able to display 
month, total tax deduction and net profit for the output.*/

import java.util.Scanner;
class PracTest1{
   public static void main(String[]args){
      Scanner read=new Scanner(System.in);
      String month;
      double sale,bill,worker,net,tax;
   
      System.out.println("----jGRASP exec : java preprac1----");
      System.out.println("****Family Mart Changlun****");
      System.out.println("****Monthly Financial Report*****");
   
      System.out.print("Input Month=");
      month=read.next();
   
      System.out.print("Input Total Sales=RM");
      sale=read.nextDouble();
   
      System.out.print("Input Utility Bill=RM");
      bill=read.nextDouble();
   
   
      tax=0.02*(sale-bill-4500);
      net=sale-tax-bill-4500;
   
      System.out.print("Total Sale for "+month);
      System.out.println("=RM"+sale);
      System.out.println("Total tax should be paid=RM"+ tax);
      System.out.print("Net profit for "+month);
      System.out.print("=RM"+net);
   }}

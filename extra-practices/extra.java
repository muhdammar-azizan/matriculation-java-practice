// Author: Muhammad Ammar bin Azizan
// GitHub: https://github.com/muhdammar-azizan
//Total saleperson monthly salary
import java.util.Scanner;
class extra{
   public static void main(String[]args){
      Scanner read=new Scanner(System.in);
      double sale,salary;
      String month;
      
      System.out.print("Enter total sales for = RM");
      sale=read.nextDouble();
   
      if (sale<=1000)
         salary=1000+(0.02*sale);
      
      else if (sale<=5000)
         salary=1000+(0.04*sale);
      
      else
         salary=1000+(0.05*sale);
   
      System.out.print("Salary = RM"+salary);
   }}
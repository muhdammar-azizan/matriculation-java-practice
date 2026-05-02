// Author: Muhammad Ammar bin Azizan
// GitHub: https://github.com/muhdammar-azizan
// Calculate and compare data usage charges for two plans using methods and loops.

import java.util.Scanner;
class method5{
   public static void main(String[]args){
      Scanner read=new Scanner(System.in);
      double usage;
   
      System.out.print("Enter data usage(mb) : ");
      usage=read.nextDouble();
   
      double planA=A(usage);
      double planB=B(usage);
   
      System.out.println("Charge rate for plan A : RM"+planA);
      System.out.println("Charge rate for plan B : RM"+planB);
   
      C(planA,planB);
   
   }
//price for plan A
   static double A(double u){
   
      int c=0;
      while(u>0){
         c++;
         u=u-100;
      }
      double price=c*2;
      return price;
   }

//price for plan B
   static double B(double u){
   
      int c=0;
      while(u>0){
         u=u-300;
         c++;
      }
      double price=c*5;
      return price;
   }

//Comparison
   static void C(double a,double b){
   
      if(a>b)
         System.out.print("Plan B is cheaper");
      else if(b>a)
         System.out.print("Plan A is cheaper");
      else
         System.out.print("Both plan has a same price");
   }
}

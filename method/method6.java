// Author: Muhammad Ammar bin Azizan
// GitHub: https://github.com/muhdammar-azizan

// Calculate delivery cost based on weight using conditional statements.
import java.util.Scanner;
class method6{
   public static void main(String[]args){
      Scanner read=new Scanner (System.in);
      double weight;
   
      System.out.print("Enter weight(kg) : ");
      weight=read.nextDouble();
   
      P(weight);
   
      System.out.print("Delivery cost : RM"+String.format("%.2f",P(weight)));
   
   }
   static double P(double w){
      double cost;
   
      if (w<1)
         cost=15*w;
      else if(w<=3)
         cost=13*w;
      else
         cost=10*w;
   
      return cost;
   }
}
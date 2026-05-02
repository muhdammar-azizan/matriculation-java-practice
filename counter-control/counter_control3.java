// Author: Muhammad Ammar bin Azizan
// GitHub: https://github.com/muhdammar-azizan

/*Calculate the BMI for 15 students*/
import java.util.Scanner;
class counter_control3{
   public static void main(String[]args){
      Scanner read=new Scanner(System.in);
      double height,weight,BMI;
      int c;
   
      c=1;
      while (c<=15){
         System.out.print("Enter height=");
         height=read.nextDouble();
      
         System.out.print("Enter weight=");
         weight=read.nextDouble();
      
         BMI=weight/(height*height);
      
         System.out.println("BMI="+BMI);
         c=c+1;
      }
   }}
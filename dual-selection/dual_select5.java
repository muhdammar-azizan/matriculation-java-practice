// Author: Muhammad Ammar bin Azizan
// GitHub: https://github.com/muhdammar-azizan

/*Please reduce your weight or You have an ideal weight"*/
import java.util.Scanner;
class dual_select5{
   public static void main(String[]args){
      Scanner read=new Scanner(System.in);
      double weight,height,BMI;
   
      System.out.print("enter your weight=");
      weight=read.nextDouble();
   
      System.out.print("enter your height=");
      height=read.nextDouble();
   
      BMI=weight/(height*height);
   
      if (BMI>=25)
         System.out.print("Please reduce your weight");
      
      else
         System.out.print("You have an ideal weight");
   }}
// Author: Muhammad Ammar bin Azizan
// GitHub: https://github.com/muhdammar-azizan

/*Weight from kilogram to pound*/
import java.util.Scanner;
class seq6{
   public static void main(String[]args){
      Scanner read=new Scanner(System.in);
      double kilogram,pound;
   
      System.out.print("enter weight in kilogram=");
      kilogram=read.nextDouble();
   
      pound=kilogram*2.2;
   
      System.out.println("weight in pound="+ pound);
   }}
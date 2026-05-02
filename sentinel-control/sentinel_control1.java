// Author: Muhammad Ammar bin Azizan
// GitHub: https://github.com/muhdammar-azizan

/*Accepts price and calculate total price until user enter value -1*/
import java.util.Scanner;
class sentinel_control1{
   public static void main (String[]args){
      Scanner read=new Scanner(System.in);
      double price,total=0;
   
      System.out.print("Enter price=RM");
      price=read.nextDouble();
   
      while (price!=-1){
         total+=price;
         
         System.out.print("Enter price=RM");
         price=read.nextDouble();
      }
      System.out.print("The total price=RM"+total);
   }}
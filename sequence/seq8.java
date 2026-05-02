// Author: Muhammad Ammar bin Azizan
// GitHub: https://github.com/muhdammar-azizan

/*Sale price of a book*/
import java.util.Scanner;
class seq8{
   public static void main(String[]args){
      Scanner read=new Scanner(System.in);
      double ori,price;
   
      System.out.print("enter original price=");
      ori=read.nextDouble();
   
      price=0.65*ori;
   
      System.out.println("sale price="+ price);
   }}
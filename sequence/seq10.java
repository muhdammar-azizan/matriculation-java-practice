// Author: Muhammad Ammar bin Azizan
// GitHub: https://github.com/muhdammar-azizan

/*Total ticket price*/
import java.util.Scanner;
class seq10{
   public static void main(String[]args){
      Scanner read=new Scanner(System.in);
      double adult,child,price;
   
      System.out.print("enter number of adult=");
      adult=read.nextDouble();
   
      System.out.print("enter number of children");
      child=read.nextDouble();
   
      price=(13.5*adult)+(7.9*child);
   
      System.out.print("total ticket price="+ price);
   }}
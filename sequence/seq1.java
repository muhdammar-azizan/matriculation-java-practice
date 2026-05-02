// Author: Muhammad Ammar bin Azizan
// GitHub: https://github.com/muhdammar-azizan

/*Calculate area of triangle*/
import java.util.Scanner;
class seq1{
   public static void main (String[]args){
      Scanner read=new Scanner(System.in);
   
      double length,height,area;
   
      System.out.print("enter length=");
      length=read.nextDouble();
   
      System.out.print("enter height=");
      height=read.nextDouble();
   
      area=0.5*length*height;
   
      System.out.print("area of triangle="+ area);
   }}
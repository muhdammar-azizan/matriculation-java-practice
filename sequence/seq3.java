// Author: Muhammad Ammar bin Azizan
// GitHub: https://github.com/muhdammar-azizan

/*Calculate area of circle*/
import java.util.Scanner;
class seq3{
   public static void main (String[]args){
      Scanner read=new Scanner(System.in);
      double radius,area;
   
      System.out.print("enter radius=");
      radius=read.nextDouble();
   
      area=3.142*(radius*radius);
   
      System.out.println("area of a circle="+ area);
   }}

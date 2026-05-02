// Author: Muhammad Ammar bin Azizan
// GitHub: https://github.com/muhdammar-azizan

/*Area of circle if radius is positive value*/
import java.util.Scanner;
class single_select5{
   public static void main(String[]args){
      Scanner aa=new Scanner(System.in);
      double radius,area;
   
      System.out.print("enter radius=");
      radius=aa.nextDouble();
   
      area=3.142*(radius*radius);
   
      if (radius>0)
         System.out.print("Area of circle="+ area);
   }}
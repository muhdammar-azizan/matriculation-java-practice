// Author: Muhammad Ammar bin Azizan
// GitHub: https://github.com/muhdammar-azizan

/*BMI of a person if height is not zero*/
import java.util.Scanner;
class single_select4{
   public static void main(String[]args){
      Scanner aa=new Scanner(System.in);
      double height,weight,BMI;
   
      System.out.print("enter height=");
      height=aa.nextDouble();
   
      System.out.print("enter weight");
      weight=aa.nextDouble();
   
      BMI=weight/(height*height);
   
      if (height!=0)
         System.out.println("BMI="+ BMI);
   }}
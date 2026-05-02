// Author: Muhammad Ammar bin Azizan
// GitHub: https://github.com/muhdammar-azizan

/*Even number or Odd number*/
import java.util.Scanner;
class dual_select2{
   public static void main(String[]args){
      Scanner read=new Scanner(System.in);
      double number,ans;
   
      System.out.print("enter number=");
      number=read.nextDouble();
   
      ans=number%2;
   
      if (ans==0)
         System.out.print("The number is even number");
      
      else
         System.out.print("The number is odd number");
   }}
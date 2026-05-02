// Author: Muhammad Ammar bin Azizan
// GitHub: https://github.com/muhdammar-azizan

/*Number entered by user is an even number*/
import java.util.Scanner;
class single_select6{
   public static void main(String[]args){
      Scanner aa=new Scanner(System.in);
      double number,answer;
   
      System.out.print("enter number=");
      number=aa.nextDouble();
   
      answer=number%2;
   
      if (answer==0)
         System.out.print("The number is even number");
   }}
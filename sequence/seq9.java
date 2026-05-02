// Author: Muhammad Ammar bin Azizan
// GitHub: https://github.com/muhdammar-azizan

/*Display four mathematical calculations of two numbers*/
import java.util.Scanner;
class seq9{
   public static void main(String[]Args){
      Scanner read=new Scanner(System.in);
      double num1,num2,addition,multiplication,substraction,division;
   
      System.out.print("enter number 1=");
      num1=read.nextDouble();
   
      System.out.print("enter number 2=");
      num2=read.nextDouble();
   
      addition=num1+num2;
      multiplication=num1*num2;
      substraction=num1-num2;
      division=num1/num2;
   
      System.out.println("addition="+ addition);
      System.out.println("multiplication="+ multiplication);
      System.out.println("substraction="+ substraction);
      System.out.println("division="+ division);
   }}
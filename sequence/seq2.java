// Author: Muhammad Ammar bin Azizan
// GitHub: https://github.com/muhdammar-azizan

/*Calculate average of three numbers*/
import java.util.Scanner;
class seq2{
   public static void main(String[]args){
      Scanner read=new Scanner(System.in);
      double num1,num2,num3,average;
   
      System.out.print("enter num1=");
      num1=read.nextDouble();
   
      System.out.print("enter num2=");
      num2=read.nextDouble();
   
      System.out.print("enter num3=");
      num3=read.nextDouble();
   
      average=(num1+num2+num3)/3;
   
      System.out.println("average of three numbers="+ average);
   }}
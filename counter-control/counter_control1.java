// Author: Muhammad Ammar bin Azizan
// GitHub: https://github.com/muhdammar-azizan

/*The sum and average of 20 marks*/
import java.util.Scanner;
class counter_control1{
   public static void main(String[]args){
      Scanner read=new Scanner(System.in);
      double mark,sum=0,average;
      int c;
   
      c=1;
      while (c<=20){
         System.out.print("Enter mark=");
         mark=read.nextDouble();
      
         System.out.print("mark  "+c);
         System.out.println("="+mark);
         sum+=mark;
         c=c+1;
      
      }
      average=sum/20;
      System.out.println("The sum="+sum);
      System.out.print("The average="+average);
   }}
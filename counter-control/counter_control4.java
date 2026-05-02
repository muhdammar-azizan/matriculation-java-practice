// Author: Muhammad Ammar bin Azizan
// GitHub: https://github.com/muhdammar-azizan

/*The average of three test for 30 students*/
import java.util.Scanner;
class counter_control4{
   public static void main(String[]args){
      Scanner read=new Scanner(System.in);
      double test1,test2,test3,avg;
      int c;
   
      c=1;
      while (c<=30){
         System.out.print("Enter mark for test1=");
         test1=read.nextDouble();
         
         System.out.print("Enter mark for test2=");
         test2=read.nextDouble();
         
         System.out.print("Enter mark for test3=");
         test3=read.nextDouble();
      
         avg=(test1+test2+test3)/3;
      
         System.out.println("The average="+ avg);
         c=c+1;
      }
   }}
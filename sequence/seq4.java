// Author: Muhammad Ammar bin Azizan
// GitHub: https://github.com/muhdammar-azizan

/*Carry mark for a student*/
import java.util.Scanner;
class seq4{
   public static void main(String[]args){
      Scanner read=new Scanner(System.in);
      double practest1,practest2,practest3,assignment1,assignment2,carry_mark;
   
      System.out.print("enter practest1=");
      practest1=read.nextDouble();
   
      System.out.print("enter practest2=");
      practest2=read.nextDouble();
   
      System.out.print("enter practest3=");
      practest3=read.nextDouble();
   
      System.out.print("enter assignment1=");
      assignment1=read.nextDouble();
   
      System.out.print("enter assignment2=");
      assignment2=read.nextDouble();
   
      carry_mark=(practest1+practest2+practest3)/3 + (assignment1+assignment2);
   
      System.out.println("carry mark="+ carry_mark);
   }}
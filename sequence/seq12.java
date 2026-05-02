// Author: Muhammad Ammar bin Azizan
// GitHub: https://github.com/muhdammar-azizan

/*Total amount payment and monthly payment*/
import java.util.Scanner;
class seq12{
   public static void main(String[]args){
      Scanner read=new Scanner(System.in);
      double year,loan,total,monthly;
   
      System.out.print("enter year=");
      year=read.nextDouble();
   
      System.out.print("enter loan=");
      loan=read.nextDouble();
   
      total=1.04*loan*year;
      monthly=total/(12*year);
   
      System.out.println("Total amount payment="+total);
      System.out.print("The monthly payment="+ monthly);
   }}
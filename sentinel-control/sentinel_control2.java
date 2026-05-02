// Author: Muhammad Ammar bin Azizan
// GitHub: https://github.com/muhdammar-azizan

//Calculate total temperature that will enter by user and the calculation will stop when temperature entered is -999
import java.util.Scanner;
class sentinel_control2{
   public static void main (String[]args){
      Scanner read=new Scanner(System.in);
      double temp,total=0;
   
      System.out.print("Enter temperature=");
      temp=read.nextDouble();
   
      while (temp!=-999){
         total+=temp;
      
         System.out.print("Enter temperature=");
         temp=read.nextDouble();
      }
      System.out.print("The total temperature="+total);
   }}
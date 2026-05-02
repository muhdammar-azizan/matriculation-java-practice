// Author: Muhammad Ammar bin Azizan
// GitHub: https://github.com/muhdammar-azizan

//Calculate the average for the first 10 +ve even numbers.
import java.util.Scanner;
class counter_control9{
   public static void main(String[]args){
      Scanner read=new Scanner(System.in);
      double c,avg,sum=0;
   
      c=2;
      while (c<=20){
         sum+=c;
         c=c+2;
      
      }
      avg=sum/10;
      System.out.print("The average="+avg);
   }}
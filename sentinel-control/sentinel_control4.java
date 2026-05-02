// Author: Muhammad Ammar bin Azizan
// GitHub: https://github.com/muhdammar-azizan

//calculate the average of a few students' height until the value is -1
import java.util.Scanner;
class sentinel_control4{
   public static void main(String[]args){
      Scanner read=new Scanner(System.in);
      double height,total=0,avg;
      int c=0;
   
      System.out.print("Enter height=");
      height=read.nextDouble();
   
      while (height!=-1){
         total+=height;
      
         c++;
      
         System.out.print("Enter height=");
         height=read.nextDouble();
      }
      avg=total/c;
   
      System.out.print("The average="+avg);
   }}
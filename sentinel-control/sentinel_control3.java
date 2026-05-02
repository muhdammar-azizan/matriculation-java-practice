// Author: Muhammad Ammar bin Azizan
// GitHub: https://github.com/muhdammar-azizan

//Calculate the average for few integers and user should key in 0 to stop
import java.util.Scanner;
class sentinel_control3{
   public static void main(String[]args){
      Scanner read=new Scanner(System.in);
      int integer,total=0,c=0;
      double avg;
   
      System.out.print("Enter integer=");
      integer=read.nextInt();
   
      while (integer!=0){
         total+=integer;
      
         c=c+1;
      
         System.out.print("Enter integer=");
         integer=read.nextInt();
      
      }
      avg=total/c;
   
      System.out.print("The average="+avg);
   }}
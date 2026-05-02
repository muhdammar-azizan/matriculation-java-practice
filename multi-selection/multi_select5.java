// Author: Muhammad Ammar bin Azizan
// GitHub: https://github.com/muhdammar-azizan

/*Student's grade will be given based on their mark*/
import java.util.Scanner;
class multi_select5{
   public static void main (String[]args){
      Scanner read=new Scanner(System.in);
      double mark;
   
      System.out.print("enter mark=");
      mark=read.nextDouble();
   
      if (mark>=80)
         System.out.print("Grade=A");
      
      else if (mark>=70)
         System.out.print("Grade=B");
      
      else if (mark>=50)
         System.out.print("Grade=C");
      
      else if (mark>=40)
         System.out.print("Grade=D");
      
      else
         System.out.print("Grade=F");
   }}
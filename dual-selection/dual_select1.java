// Author: Muhammad Ammar bin Azizan
// GitHub: https://github.com/muhdammar-azizan

/*The student is taking Computer Science subject or The student is taking Biology subject*/
import java.util.Scanner;
class dual_select1{
   public static void main (String[]args){
      Scanner read=new Scanner(System.in);
      int modul;
   
      System.out.print("enter Modul=");
      modul=read.nextInt();
   
      if (modul==2)
         System.out.print("The student is taking Computer Science subject");
      
      else
         System.out.print("The student is taking Biology subject");
   }}
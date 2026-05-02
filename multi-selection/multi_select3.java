// Author: Muhammad Ammar bin Azizan
// GitHub: https://github.com/muhdammar-azizan

/*Choice for holiday destination*/
import java.util.Scanner;
class multi_select3{
   public static void main (String[]args){
      Scanner read=new Scanner(System.in);
      int choice;
   
      System.out.print("enter choice=");
      choice=read.nextInt();
   
      if (choice==1)
         System.out.print("Pulau Langkawi");
      
      else if (choice==2)
         System.out.print("Cameron Highland");
      
      else if (choice==3)
         System.out.print("Genting Highland");
      
      else if (choice==4)
         System.out.print("Bukit Merah");
      
      else 
         System.out.print("Your choice is not in the list");
   }}
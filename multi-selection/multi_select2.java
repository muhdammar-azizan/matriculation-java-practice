// Author: Muhammad Ammar bin Azizan
// GitHub: https://github.com/muhdammar-azizan

/*The people age is older ,younger or same*/
import java.util.Scanner;
class multi_select2{
   public static void main (String[]args){
      Scanner read=new Scanner(System.in);
      int age1,age2;
   
      System.out.print("The first person age=");
      age1=read.nextInt();
   
      System.out.print("The second person age=");
      age2=read.nextInt();
   
      if (age1>age2)
         System.out.print("The first person is older");
      
      else if (age1<age2)
         System.out.print("The second person is older");
      
      else 
         System.out.print("Both are same age");
   }}
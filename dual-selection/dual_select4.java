// Author: Muhammad Ammar bin Azizan
// GitHub: https://github.com/muhdammar-azizan

/*The first person is older or The second person is older*/
import java.util.Scanner;
class dual_select4{
   public static void main(String[]args){
      Scanner read=new Scanner(System.in);
      int age1,age2;
   
      System.out.print("enter age first person=");
      age1=read.nextInt();
   
      System.out.print("enter age second person=");
      age2=read.nextInt();
   
      if (age1>age2)
         System.out.print("The first person is older");
      
      else 
         System.out.print("The second person is older");
   }}
// Author: Muhammad Ammar bin Azizan
// GitHub: https://github.com/muhdammar-azizan


/*CGPA >= 3.75 you are excellent student*/
import java.util.Scanner;
class single_select3{
   public static void main(String[]args){
      Scanner aa=new Scanner(System.in);
      double grade;
   
      System.out.print("enter grade=");
      grade=aa.nextDouble();
   
      if (grade>=3.75)
         System.out.println("You are an excellent student");
   }}
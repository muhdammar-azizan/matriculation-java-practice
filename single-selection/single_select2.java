// Description: Student age below 45 = You are able to take phd
// Author: Muhammad Ammar bin Azizan
// GitHub: https://github.com/muhdammar-azizan

import java.util.Scanner;
class single_select2{
   public static void main(String[]args){
      Scanner aa=new Scanner(System.in);
      String name;
      int age;
   
      System.out.print("enter name=");
      name=aa.nextLine();
   
      System.out.print("enter age=");
      age=aa.nextInt();
   
      if (age<45)
         System.out.println("You are eligible to take a PHDprogramme");
   }}
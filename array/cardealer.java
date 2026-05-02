// Author: Muhammad Ammar bin Azizan
// GitHub: https://github.com/muhdammar-azizan
// Analyze car sales data using arrays to find highest, lowest, and average sales.

import java.util.Scanner;
class cardealer{
   public static void main(String[]args){
      Scanner read=new Scanner (System.in);
      String[]dealer={"Azman","Zahir","Rashid","Wee Na","Lucy"};
      int[] car=new int[5];
      int total=0;
      double average;
   
      for(int i=0;i<5;i++){
         System.out.print("Enter car sale dealer"+(i+1)+":");
         car[i]=read.nextInt();
         total=total+car[i];
      }
      average=total/5;
   
      int highsale=car[0];
      String highdealer=dealer[0];
      int lowsale=car[0];
      String lowdealer=dealer[0];
   
      for(int i=0;i<5;i++){
      
         if(car[i]>highsale){
            highsale=car[i];
            highdealer=dealer[i];}
      
         if(car[i]<lowsale){
            lowsale=car[i];
            lowdealer=dealer[i];}
      }
      System.out.println("Highest sale"+ highsale);
      System.out.println("Highest sale make by"+highdealer);
      System.out.println("Lowest sale"+lowsale);
      System.out.println("Lowest sale make by"+lowdealer);
      System.out.println("Average car sale"+average);
   }}
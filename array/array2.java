// Author: Muhammad Ammar bin Azizan
// GitHub: https://github.com/muhdammar-azizan
// Find the highest monthly sales and corresponding month using arrays.

import java.util.Scanner;
class array2{
   public static void main(String[]args){
   
      String[] month={"Jan","Feb","Mac","Apr","Mei","Jun"};
      int[] monthlySales={30,28,35,25,33,18};
   
      double max=monthlySales[0];
      String maxmonth=month[0];
   
      for (int i=0; i<monthlySales.length; i++){
      
         if (monthlySales[i]>max){
            max=monthlySales[i];
            maxmonth=month[i];
         }
      }
      System.out.println("The highest sales : "+max);
      System.out.print("Month : "+ maxmonth);
   }
}
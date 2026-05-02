// Author: Muhammad Ammar bin Azizan
// GitHub: https://github.com/muhdammar-azizan

/*Calculate the total for the first 20 positive integers*/
import java.util.Scanner;
class counter_control8{
   public static void main(String[]args){
      Scanner read=new Scanner(System.in);
      int c,total=0;
   
      c=1;
      while (c<=20){
         total+=c;
         c++; 
      }
      System.out.print("Total="+total);
   }}
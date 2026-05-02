// Author: Muhammad Ammar bin Azizan
// GitHub: https://github.com/muhdammar-azizan

/*Display odd numbers from 3 to 39*/
import java.util.Scanner;
class counter_control6{
   public static void main(String[]args){
      Scanner read=new Scanner(System.in);
      int c;
   
      c=3;
      while (c<=39){
         System.out.println("odd number="+c);
         c=c+2;
      }
   }}
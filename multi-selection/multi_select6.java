// Author: Muhammad Ammar bin Azizan
// GitHub: https://github.com/muhdammar-azizan

/*A program will display the name of the programme based on the code*/
import java.util.Scanner;
class multi_select6{
   public static void main(String[]args){
      Scanner read=new Scanner(System.in);
      int code;
   
      System.out.print("enter code=");
      code=read.nextInt();
   
      if (code==1)
         System.out.print("Degree in Computer Science");
      
      else if (code==2)
         System.out.print("Degree in Information Technology");
      
      else if (code==3)
         System.out.print("Degree in Computer Engineering");
      
      else
         System.out.print("Degree in Electrical Engineering");
   }}
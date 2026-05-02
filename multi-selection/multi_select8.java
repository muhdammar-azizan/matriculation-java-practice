// Author: Muhammad Ammar bin Azizan
// GitHub: https://github.com/muhdammar-azizan

/*Phone bill per month*/
import java.util.Scanner;
class multi_select8{
   public static void main(String[]args){
      Scanner read=new Scanner(System.in);
      double usage,bill;
   
      System.out.print("enter usage per month=RM");
      usage=read.nextDouble();
   
      if (usage<=50)
         bill=usage;
      
      else if (usage<=100)
         bill=0.95*usage;
      
      else
         bill=0.8*usage;
   
      System.out.print("The bill=RM"+ bill);
   }}
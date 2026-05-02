// Author: Muhammad Ammar bin Azizan
// GitHub: https://github.com/muhdammar-azizan

/* Water bill based on consumption per m3*/
import java.util.Scanner;
class multi_select7{
   public static void main(String[]args){
      Scanner read=new Scanner(System.in);
      double usage,bill;
   
      System.out.print("enter water usage=");
      usage=read.nextDouble();
   
      if (usage<=20)
         bill=0.4*usage;
      
      else if (usage<=40)
         bill=8+0.2*(usage-20);
      
      else
         bill=12+0.1*(usage-40);
   
      System.out.print("Bill=RM"+bill);
   }}
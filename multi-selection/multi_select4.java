// Author: Muhammad Ammar bin Azizan
// GitHub: https://github.com/muhdammar-azizan

/*Product A=RM32.10/Product B=RM75.30/Product C=RM24.60*/
import java.util.Scanner;
class multi_select4{
   public static void main(String[]args){
      Scanner read=new Scanner(System.in);
      double quantity,price;
      char code;
   
      System.out.print("enter product code=");
      code=read.next().charAt(0);
   
      System.out.print("enter quantity=");
      quantity=read.nextDouble();
   
      if (code=='A')
         price=32.10*quantity;
      
      else if (code=='B')
         price=75.30*quantity;
      
      else
         price=24.60*quantity;
   
      System.out.print("Price=RM"+String.format("%.2f",price));
   }}
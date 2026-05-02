// Author: Muhammad Ammar bin Azizan
// GitHub: https://github.com/muhdammar-azizan

/*RM5 each if at least 5unit / RM7 each otherwise*/
import java.util.Scanner;
class dual_select3{
   public static void main (String[]args){
      Scanner read=new Scanner (System.in);
      int quantity,price;
   
      System.out.print("enter quantity=");
      quantity=read.nextInt();
   
      if (quantity>=5)
         price=5*quantity;
      
      else 
         price=7*quantity;
   
      System.out.print("Price=RM"+ price);
   }}
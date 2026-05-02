// Author: Muhammad Ammar bin Azizan
// GitHub: https://github.com/muhdammar-azizan

/*Monthly net salary of the factory worker*/
import java.util.Scanner;
class seq5{
   public static void main(String[]args){
      Scanner read=new Scanner(System.in);
      double working_hour,salary;
   
      System.out.print("enter working hour=");
      working_hour=read.nextDouble();
   
      salary=(0.89)*(5.5*working_hour);
   
      System.out.println("monthly net salary="+ salary);
   }}
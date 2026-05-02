// Author: Muhammad Ammar bin Azizan
// GitHub: https://github.com/muhdammar-azizan
// Calculate book purchase price, discount, and salesman commission based on user input.

/*As a programmer, you have been hired by Pustaka Gemilang, Changlun to create a java
program that can be used by the human resources department. The program should be able to
calculate price after discount based on the quantity and price of the book. Customers will get
10% discount from the total price. This company also give commission 3% from the price after
discount to salesman. Your program will accept book name, quantity of book purchase and
price of book per unit as an input. After processing the program will display book name, total
price before discount, price after discount and commission receive by salesman as output.*/

import java.util.Scanner;
class practest1{
   public static void main(String[]args){
      Scanner read=new Scanner(System.in);
      String book;
      double unitprice,oriprice,price,comm;
      int quantity;
   
      System.out.println("*****Pustaka Gemilang Changlun*****");
      System.out.println("*****Customer Selling Records*****");
   
      System.out.print("Book Name  :  ");
      book=read.nextLine();
   
      System.out.print("Price per Unit :RM ");
      unitprice=read.nextDouble();
   
      System.out.print("Quantity Purchase : ");
      quantity=read.nextInt();
   
      oriprice=unitprice*quantity;
      price=0.9*oriprice;
      comm=0.03*price;
   
      System.out.println("Purchase Record:");
      System.out.println("Book Name: "+book);
      System.out.println("Price before discount: RM "+oriprice);
      System.out.println("Price after discount: RM "+price);
      System.out.println("Salesman Commission: RM"+comm);
      System.out.println("*****Record Complete*****");
      System.out.print("This report prepared by Muhammad Ammar bin Azizan");
   }} 


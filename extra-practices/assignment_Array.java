// Author: Muhammad Ammar bin Azizan
// GitHub: https://github.com/muhdammar-azizan
// Store daily temperatures in an array and search for a specific value, displaying its index if found.

/*A program will collect data of daily temperature from the user and save them in an 
array by using suitable data type and array name.
The array should consist of minimum ten (10) days of temperature. 
This program also allow user to retrieve the saved data by key in a specifying a search 
keyword. 
The program then will display the following information: 
▪ an appropriate message if the element is found 
▪ the index (s) of found element 
▪ an appropriate message if the element is not found*/

import java.util.Scanner;
class assignment_Array{
   public static void main (String[]args){
      Scanner read=new Scanner(System.in);
   
      double[] tempt=new double[10];//array declaration
      double search;//variable declaration
   
      System.out.println("Enter daily temperature:-"); //user friendly message
   
   //use for loop to input elements in array
      for (int i=0; i<tempt.length; i++){   //(initailization;evaluation;updating)
         System.out.print("Temperature for day "+(i+1)+" : ");  //user friendly message to input value into array
         tempt[i]=read.nextDouble();   //input statement
      }
      System.out.print("Enter a temperature to search: ");  //user friendly message to input the temperature to search
      search=read.nextDouble();   //input statement
   
   //for loop to count how many value in the array that same with the search value
      int c=0;  //initialization
      for (int i=0; i<tempt.length; i++){  //(initialization;evaluation;updating)
         if (search==tempt[i])  //if statement
            c++;  //updating
      }
   
   //if statement to determine whether the search element is found or not
      if (c>0){  //if statement
         System.out.println("FOUND");}//output statement
      else{
         System.out.print("NOT FOUND");//output statement
      }
   
   //using if statement and for loop to display the index of found element
      if (c>0)  //if statement
         for (int i=0; i<tempt.length; i++){  //(initialization;evaluation;updating)
            if (search==tempt[i])  //if statement
               System.out.println("The index of found element : "+i); //output statement
         }
   }}
// Author: Muhammad Ammar bin Azizan
// GitHub: https://github.com/muhdammar-azizan
// Store and analyze student heights using arrays, including sum, average, and search count.

//program to read height of 10 students
//read height
//sum of height
//average of height
//number of student with height that search by user
//value and index highest
//value and index shortest

import java.util.Scanner;
class array1{
   public static void main(String[]args){
      Scanner read= new Scanner(System.in);
   
      double[] height=new double[4];
      double sum=0,average,min,max,numover100,search;
   
      System.out.println("Enter height for each students :");
   
      for (int i=0;i<height.length;i++){
         System.out.print("Enter height for student "+(i+1)+" :");
         height[i]=read.nextDouble();
      
         sum+=height[i];
      }
      System.out.println("The sum : "+sum);
   
      average=sum/height.length;
      System.out.println("The average : "+average);
   
      System.out.print("Enter a height to search :");
      search=read.nextDouble();
   
   
      int c=0;
      for (int i=0;i<height.length;i++){
         if (search==height[i])
            c++;
      }
      System.out.print("The number of students with height of "+search+" is : "+c);
   }}
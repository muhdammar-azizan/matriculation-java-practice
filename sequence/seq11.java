// Author: Muhammad Ammar bin Azizan
// GitHub: https://github.com/muhdammar-azizan

/*Total fees for each course and total fees for both courses*/
import java.util.Scanner;
class seq11{
   public static void main(String[]args){
      Scanner read=new Scanner(System.in);
      double studentrobo,studentnet,robotic,networking,both;
   
      System.out.print("enter number of studenst of Robotic course=");
      studentrobo=read.nextDouble();
   
      System.out.print("enter number of students of Networking course=");
      studentnet=read.nextDouble();
   
      robotic=55*studentrobo;
      networking=105*studentnet;
      both=robotic+networking;
   
      System.out.println("total fees for Roboti course="+ robotic);
      System.out.println("total fees for Networking course="+ networking);
      System.out.print("total fees for both courses="+ both);
   }}
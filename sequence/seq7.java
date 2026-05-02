// Author: Muhammad Ammar bin Azizan
// GitHub: https://github.com/muhdammar-azizan

/*Distance from station A to station B*/
import java.util.Scanner;
class seq7{
   public static void main(String[]args){
      Scanner read=new Scanner(System.in);
      double speed,time,distance;
   
      System.out.print("enter speed=");
      speed=read.nextDouble();
   
      System.out.print("enter time=");
      time=read.nextDouble();
   
      distance=speed*time;
   
      System.out.println("distance="+ distance);
   }}
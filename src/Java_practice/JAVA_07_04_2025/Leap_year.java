package Java_practice.JAVA_07_04_2025;

import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a year");
      int year= sc.nextInt();
      if(year%4==0||(year%100==0&&year%400==0)){
          System.out.println(year+ "is a Leap Year");
      }else {
          System.out.println(year+" is not a leap year");
      }
    }
}

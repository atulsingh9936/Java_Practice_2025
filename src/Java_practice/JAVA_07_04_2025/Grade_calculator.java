package Java_practice.JAVA_07_04_2025;

import java.util.Scanner;

public class Grade_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int score=  sc.nextInt();
        char grade;
          if(score>=90&&score<=100){
            grade='A';
        } else if (score>=80&&score<=89) {
            grade='B';
        } else if (score>=70&&score<=79) {
            grade='c';
        } else if (score>=60&&score<=69) {
            grade='d';
        }else {
            grade='e';
        }

        System.out.println("your grade is"+" "+grade);
    }
}

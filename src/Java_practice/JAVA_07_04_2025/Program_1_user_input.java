package Java_practice.JAVA_07_04_2025;

import java.util.Scanner;

public class Program_1_user_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
       int num= sc.nextInt();
        sc.nextLine();
        System.out.println("You entered number is "+num);

        System.out.println("enter your name");
        String string=  sc.nextLine();
        System.out.println("your name is"+" "+ string);
        System.out.println("enter a sentence");
        String sentence=  sc.nextLine();
        System.out.println("you sentence is" +sentence);

    }
}

package Java_practice;

import java.util.Scanner;

public class Prime_number {
    public static void main(String[] args) {

        int num =4;
        int count =0;
        if (num>1){

            for(int i=1;i<=num;i++){
                if(num%i==0)
                    count++;

            }
            if(count ==2){
                System.out.println("the number is prime number");
            }else {
                System.out.println("the number is not a prime number");
            }

        }
        else{
            System.out.println("the no is not a prime number");
        }


    }
}
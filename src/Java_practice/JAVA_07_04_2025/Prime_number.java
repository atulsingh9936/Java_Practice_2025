package Java_practice.JAVA_07_04_2025;

public class Prime_number {
    public static void main(String[] args) {
        int count = 0;
        int number = 7;
        for (int i = 1; i <=number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
               if (count == 2) {
                    System.out.println(number + "is a prime number");
                } else {
                    System.out.println(number + "is not a prime number");

                }


    }
}
package Java_practice.JAVA_07_04_2025;

public class Fibonacci_series {
    public static void main(String[] args) {
        int num=0;
        int num1=1;
        int sum=0;
        System.out.println(num);
        System.out.println(num1);
        while(sum<10) {
            sum = num + num1;
            System.out.println(sum);
            num = num1;
            num1 = sum;
        }
    }
}

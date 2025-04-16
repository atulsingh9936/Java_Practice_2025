package Java_practice.JAVA_07_04_2025;

public class Factorial_1 {
    public static void main(String[] args) {
        int factorial =1;
        int num =6;
        for(int i=num;i>0;i--){
            factorial= factorial*i;
        }
        System.out.println(factorial);
    }
}

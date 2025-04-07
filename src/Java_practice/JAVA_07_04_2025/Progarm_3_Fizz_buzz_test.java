package Java_practice.JAVA_07_04_2025;

public class Progarm_3_Fizz_buzz_test {
    public static void main(String[] args) {
        for(int i =1;i<=100;i++){
            if(i%3==0 && i%5==0){
                System.out.println(i+" "+":FizzBuzz");
            } else if (i%5==0) {
                System.out.println(i+" "+":Buzz");

            } else  if(i%3==0) {
                System.out.println(i+" "+":Fizz");
                
            }else{
                System.out.println(i);
            }
        }
    }
}

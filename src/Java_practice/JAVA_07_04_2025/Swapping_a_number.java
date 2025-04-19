package Java_practice.JAVA_07_04_2025;

public class Swapping_a_number {
    public static void main(String[] args) {
        int a =10;
        int b =20;

        System.out.println("before swapping the values are "+a+" "+b);
       /* int temp=a;
        //Logic1: using third variable
        a=b;
        b=temp;*/
        a= a+b;  // 10+20=30
        b=a-b;  // 30-20=10
        a= a-b; //30-10=20


        System.out.println("after swaping the values are"+a+" "+b);
    }
}

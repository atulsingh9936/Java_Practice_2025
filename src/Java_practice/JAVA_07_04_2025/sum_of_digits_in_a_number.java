package Java_practice.JAVA_07_04_2025;

public class sum_of_digits_in_a_number {
    public static void main(String[] args) {
        int num =14;
        int sum =0;
        while(num>0){
            int rem = num%10;
            sum =sum+rem;
            num= num/10;
        }
        System.out.println("the sum of digits are"+sum);
    }
}

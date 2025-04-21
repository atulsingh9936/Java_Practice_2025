package Java_practice.JAVA_07_04_2025;

public class Count_number_of_digit_in_integer {
    public static void main(String[] args) {

        int num =99365334;
        int count =0;
        while(num>0){
            num = num/10;
            count++;
        }
        System.out.println("Number of digits in element is" + count);

    }
}

package Java_practice.JAVA_07_04_2025;

public class Count_even_and_odd_digits {
    public static void main(String[] args) {
        int num=123477878;
        int even_count=0;
        int odd_count=0;
        while(num>0){
            int rem = num%10;
            if(rem%2==0){
                even_count++;
            }
            else{
                odd_count++;
            }
            num= num/10;
        }
        System.out.println("no of even numbers are :"+even_count);
        System.out.println("no of odd numbers are :"+odd_count);
    }
}

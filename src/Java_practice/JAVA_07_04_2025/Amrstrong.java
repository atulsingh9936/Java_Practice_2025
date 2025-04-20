package Java_practice.JAVA_07_04_2025;

public class Amrstrong {
    public static void main(String[] args) {

        int n =153;
        int temp =n;
        int sum =0, r;
        while(n>0){
            r= n%10;
            n = n/10;
            sum = sum+r*r*r;

        }
        if(temp==sum){
            System.out.println(temp+"is an armstrong");
        }else{
            System.out.println(temp+"is not an armstrong");
        }
    }
}

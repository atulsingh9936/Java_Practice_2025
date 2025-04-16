package Java_practice.JAVA_07_04_2025;

public class palindrome {
    public static void main(String[] args) {

         int num=1229;
         int actualnum=num;
         int rev =0;
         while(num!=0){
             rev = rev*10+num%10;
             num= num/10;
         }if(actualnum==rev){
             System.out.println("the number is palindrome");
         }else{
             System.out.println("the number is not palindrome");
         }
         }
    }


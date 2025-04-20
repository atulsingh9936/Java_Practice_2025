package Java_practice.JAVA_07_04_2025;

public class Greatest_of_three_number {
    public static void main(String[] args) {
        int a=100,b =600,c =9;

//        if(a>b && a>c){
//            System.out.println(a +" is the largest number");
//        }
//        else if(b>a && b>c){
//            System.out.println(b+ "is the largest number");
//        }
//        else {
//            System.out.println(c+" is the largest number");
//        }

    /*  int largest1=  a>b?a:b;
      int largest2= c>largest1?c:largest1;
        System.out.println(largest2+" is the largest number");*/


        int largest = c>(a>b?a:b)?c:(a>b?a:b);
        System.out.println(largest+ " is the largest number");




    }
}

package Java_practice.JAVA_07_04_2025;

public class Triangle_classifier {
    public static void main(String[] args) {
        int side1=4;
        int side2=4;
        int side3=4;
        if(side1==side2&&side2==side3){
            System.out.println("equilateral triangle");
        } else if (side1==side2||side2==side3||side1==side3) {
            System.out.println("Isosceles triangle");
        }else {
            System.out.println("scalene triangle");
        }
    }
}

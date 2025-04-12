package Java_practice.JAVA_07_04_2025;

public class Pyramid {
    public static void main(String[] args) {
        int n =5;
        for(int k=2;k<=n;k++){
            for (int l=2;l<=k;l++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}

package Java_practice.JAVA_07_04_2025;

public class String_reverse {
    public static void main(String[] args) {

        String name = "Atul";
        String ReversedString = " ";
        for (int i = name.length() - 1; i >= 0; i--) {
        // ReversedString= ReversedString+  name.charAt(i);
            System.out.println(name.charAt(i));

        }
      //  System.out.println(ReversedString);
    }
}
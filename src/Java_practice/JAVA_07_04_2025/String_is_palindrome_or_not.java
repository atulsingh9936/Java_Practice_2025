package Java_practice.JAVA_07_04_2025;

public class String_is_palindrome_or_not {
    public static void main(String[] args) {
        String name ="MADAM";
        String Reversedstring ="";
        for(int i=name.length()-1;i>=0;i--){
            Reversedstring = Reversedstring+name.charAt(i);
        }
        System.out.println("Original String: " + name);
        System.out.println("Reversed String: " + Reversedstring);
        if(name.equalsIgnoreCase(Reversedstring)){
            System.out.println(name+""+"Is palindrome");
        }else {
            System.out.println(name+"Is not a palindrome");
        }
    }
}

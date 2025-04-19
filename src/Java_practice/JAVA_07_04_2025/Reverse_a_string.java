package Java_practice.JAVA_07_04_2025;

public class Reverse_a_string {
    public static void main(String[] args) {
        String name = "Rahul shetty";
        String reversetsring ="";
        for(int i=name.length()-1;i>=0;i--){
            reversetsring =reversetsring+ name.charAt(i);
        }
        System.out.println(reversetsring);
    }
}

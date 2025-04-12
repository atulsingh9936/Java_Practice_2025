package Java_practice.JAVA_07_04_2025;

public class Vowel_consonant {
    public static void main(String[] args) {
        int vowel=0;
        int consonant =0;
        String str="abcd";
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            if (ch =='a'|| ch =='e'|| ch =='i'|| ch =='o'|| ch =='u'){
                System.out.println(ch+" is an vowel");
                vowel++;
            }else{
                System.out.println(ch +" is consonant");
                consonant++;
            }
        }
        System.out.println("vowel counts:" +vowel);
        System.out.println("consonant counts:"+consonant);

    }
}
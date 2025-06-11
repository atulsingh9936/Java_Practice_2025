package Java_practice.JAVA_07_04_2025.String_programs;

public class Count_occurence_of_character_in_a_string {
    public static void main(String[] args) {
     String s = "Java Programming Java oops";
   int totalcount=  s.length();
 int totalcount_afterremovea=  s.replace("J","").length();

   int count= totalcount-totalcount_afterremovea;

        System.out.println("number of occurrences of a is "+ count);

    }
}

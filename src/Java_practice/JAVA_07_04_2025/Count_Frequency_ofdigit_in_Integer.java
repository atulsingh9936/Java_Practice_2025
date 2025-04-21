package Java_practice.JAVA_07_04_2025;

import java.util.HashMap;
import java.util.Set;

public class Count_Frequency_ofdigit_in_Integer {

    public static void getdigitcount(long number){
        if(String.valueOf(number).length()==1){
            System.out.println(number+" : "+1);
            return;
        }


        HashMap<Long,Integer> Digit_Map =new HashMap<Long,Integer>();
        while(number!=0){
            long lastdigit = number%10;
            if(Digit_Map.containsKey(lastdigit)){
                Digit_Map.put(lastdigit,Digit_Map.get(lastdigit)+1);
            }else{
                Digit_Map.put(lastdigit,1);
            }
            number=number/10;
        }

       Set<Long> Keys= Digit_Map.keySet();
        for(Long Key:Keys){
            System.out.println(Key+" : "+Digit_Map.get(Key));
        }



    }



    public static void main(String[] args) {
        getdigitcount(4);



    }
}

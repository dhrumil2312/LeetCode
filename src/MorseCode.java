import java.util.Arrays;
import java.util.HashSet;

public class MorseCode {

    public static String calMorseCode(String s){
        String[] morseCode = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String res = "";
        for(char i : s.toCharArray()){
            res += morseCode[(int) i -97];
            //System.out.println(res);
        }
        return res ;
    }

    public static void main(String[] args) {

        String[] words = {"gin", "zen", "gig", "msg"};
        HashSet<String> unique = new HashSet<>();

        for(String a : words){
            unique.add(calMorseCode(a));
        }
        System.out.println(unique.size());
    }
}

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class KeyboardRow {
    public static void main(String[] args) {
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        List<String > ans = new ArrayList<>();

        String krow1= "qwertyuiop";
        String krow2= "asdfghjkl";
        String krow3= "zxcvbnm";
        Set<Character> row1 = new HashSet<>();
        Set<Character> row2 = new HashSet<>();
        Set<Character> row3 = new HashSet<>();


        krow1.chars().forEach(value -> row1.add((char) value));
        krow2.chars().forEach(value -> row2.add((char) value));
        krow3.chars().forEach(value -> row3.add((char) value));

        for(String input : words ){
            Set<Character> cur = new HashSet<>();
            input.toLowerCase().chars().forEach(value -> cur.add((char) value));
            if(row1.containsAll(cur) || row2.containsAll(cur) || row3.containsAll(cur))  ans.add(input);
        }

        String[] res = ans.toArray(new String[0]);
        for(String input : res) System.out.println(input);

    }
}

import java.util.HashMap;
import java.util.Objects;

public class JudgeRoute {

    public static void main(String[] args) {

        char[] input = "UDUD".toCharArray();
        HashMap<Character , Integer> hm = new HashMap<>();

        for (char anInput : input) {
            if (!hm.containsKey(anInput)) {
                hm.put(anInput, 1);
            } else {
                int old = hm.get(anInput);
                hm.put(anInput, old + 1);
            }
        }

        System.out.println(hm.getOrDefault('U',0) +" "+ hm.getOrDefault('D',0) +" "+ hm.getOrDefault('L',0) +" "+ hm.getOrDefault('R',0) );
        if((hm.getOrDefault('U',0) == (hm.getOrDefault('D',0)))&& (hm.getOrDefault('L', 0) == hm.getOrDefault('R', 0)))
            System.out.println("1");

        String moves = "UDUDUD";

        int x = 0;
        int y = 0;

        for(char a : moves.toUpperCase().toCharArray()){
            System.out.println(a);
            switch (a){
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
                case 'L':
                    x++;
                    break;
                case 'R':
                    x--;
                    break;
            }
        }
        System.out.println(y);
        System.out.println(x==0 && y==0);
    }
}

import java.util.HashMap;
import java.util.Objects;

public class JudgeRoute {

    public static void main(String[] args) {

        char[] input = "UDUD".toCharArray();
        HashMap<Character , Integer> hm = new HashMap<>();

        for (char anInput : input) {
            //System.out.println(anInput);

            if (!hm.containsKey(anInput)) {
                hm.put(anInput, 1);
            } else {
                int old = hm.get(anInput);
                hm.put(anInput, old + 1);
            }
            //hm.values().iterator().forEachRemaining(System.out::println);
        }
        System.out.println(hm.getOrDefault('U',0) +" "+ hm.getOrDefault('D',0) +" "+ hm.getOrDefault('L',0) +" "+ hm.getOrDefault('R',0) );
        if((hm.getOrDefault('U',0) == (hm.getOrDefault('D',0)))&& (hm.getOrDefault('L', 0) == hm.getOrDefault('R', 0)))
            System.out.println("1");

    }
}

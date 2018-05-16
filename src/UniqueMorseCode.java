import java.util.HashSet;

public class UniqueMorseCode {

    public static void main(String[] args) {
        String[] arr;
        arr = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

        String[] queries ;
        queries = new String[]{"gin", "zen", "gig", "msg"};
        String ans = "";

        HashSet<String> new_hash = new HashSet<>();

        for (int i = 0 ; i < queries.length ; i++){
            char[] cur =  queries[i].toCharArray();
            ans = "";
            for(int j = 0; j < cur.length ; j++){
                int cur_ascii = cur[j];
                String cur_morse = arr[cur_ascii - 97];
                ans += cur_morse;
            }
            new_hash.add(ans);

        }
        System.out.println(new_hash.size());
    }
}

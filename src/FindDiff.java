import java.util.HashMap;
import java.util.HashSet;

public class FindDiff {
    public static void main(String[] args) {
        char[] a = "abcd".toCharArray();
        char[] b= "abcde".toCharArray();

        HashMap<Character , Integer> hash_a = new HashMap<>();
        HashMap<Character , Integer> hash_b = new HashMap<>();

        for( int i = 0 ; i < a.length ; i ++ ) {
            int old = hash_a.getOrDefault(a[i],0);
            hash_a.put(a[i] , old+1);
        }
        for( int i = 0 ; i < b.length ; i ++ ) {
            int old = hash_b.getOrDefault(b[i],0);
            hash_b.put(b[i] , old+1);
        }

        if(hash_b.size() != hash_a.size()){
            for (Character s : hash_b.keySet()){
                if(!hash_a.containsKey(s)){
                    System.out.println(s);
                    break;
                }
            }
        }else{
            for(Character s : hash_b.keySet()){
                int b1 = hash_b.get(s);
                int a1 = hash_a.get(s);
                if (b1 != a1) {
                    System.out.println(s);
                    break;
                }
            }

        }
    }
}

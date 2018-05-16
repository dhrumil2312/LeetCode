import java.util.HashMap;
import java.util.Scanner;

public class JewelThief {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] a = sc.next().toCharArray();
        char[] b = sc.next().toCharArray();
        int count = 0;
        HashMap<Character , Integer>  b_hash= new HashMap<>();

        for (int i = 0 ; i < b.length; i++){
            if (!b_hash.containsKey(b[i])) {
                b_hash.put(b[i] , 1);
            } else {
                int old = b_hash.get(b[i]);
                b_hash.put(b[i] , old+1);
            }
        }

        for(int i = 0 ; i < a.length ; i++ ){
            if (b_hash.containsKey(a[i])) {
                count += b_hash.get(a[i]);
            }
        }
        System.out.println(count);
    }

}

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement {

    public static void main(String[] args) {
        int[] nums1 = {4,1,2} ;
        int[] nums2 = {1,3,4,2} ;

        Stack<Integer> greater = new Stack<>();
        HashMap<Integer , Integer> hs = new HashMap<>();

        for (int aNums2 : nums2) {
            while (!greater.empty() && greater.peek() < aNums2) {
                hs.put(greater.pop(), aNums2);
            }
            greater.push(aNums2);
        }

        for(int i = 0 ; i < nums1.length ; i++){
            nums1[i] = hs.getOrDefault(nums1[i],-1);
        }

        System.out.println(nums1);

        String a = "abcds";
        String b = a+a ;
        String c = "cdsab";


    }
}

import java.util.Arrays;
import java.util.HashMap;

public class TwoSums {
    public static void main(String[] args) {
        int[] nums = {3,3};
        int target = 6;
        int[] res = new int[2];

        HashMap<Integer , Integer> indexMap = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(!indexMap.containsKey(target-nums[i])){
                indexMap.put(nums[i] , i);
            }
            else{
                res[1] = i;
                res[0] = indexMap.get(target-nums[i]);
                System.out.println(res[0] +" " + res[1]);
                break;
            }
        }

    }
}

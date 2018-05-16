import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class KMostFrequent {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;

        HashMap<Integer , Integer> countMap = new HashMap<>();

        for(int num : nums){
            if(!countMap.containsKey(num)){
                countMap.put(num , 1);
            }
            else{
                countMap.put(num , countMap.get(num)+1);
            }
        }

    Map<Integer , Integer> result = countMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(k).collect(Collectors.toMap(Map.Entry::getKey , Map.Entry::getValue,(oldValue , newValue) -> oldValue , LinkedHashMap::new ));
        System.out.println(result);
        List<Integer> res = new ArrayList<>();

        for(Map.Entry<Integer , Integer> entry : result.entrySet()){
            res.add(entry.getKey());
        }


    }
}

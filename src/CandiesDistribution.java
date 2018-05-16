import java.util.HashSet;
import java.util.Set;

public class CandiesDistribution {
    public static void main(String[] args) {

        int[] candies = {1,1,2,3};
        Set<Integer> distinct = new HashSet<>();
        for(int input : candies){
            distinct.add(input);
        }

        if (distinct.size() == candies.length /2) System.out.println(distinct.size());
        else if(distinct.size() > candies.length /2 ) System.out.println(candies.length /2);
        else System.out.println(distinct.size()/2);

    }
}

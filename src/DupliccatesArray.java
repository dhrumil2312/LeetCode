import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DupliccatesArray {
    public static void main(String[] args) {
        int[] array = {4,3,2,7,8,2,3,1};
        HashMap<Integer , Integer> unique = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for(int a : array){
            if(unique.containsKey(a)){
                res.add(a);
            }
            else{
                unique.put(a ,1);
            }

        }
        for(int a : res){
            System.out.println(a);
        }

    }
}

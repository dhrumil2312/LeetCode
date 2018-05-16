import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelfDividingNumbers {
    public static void main(String[] args) {
        int left = 1;
        int right = 10;

        List<Integer> arr = new ArrayList<>();
        int j = 0;
        for(int i = left ; i <= right ; i++){
            j = i;
            for(;j>0 ; j = j/10){
                if((j%10 == 0) || (i%(j%10))!=0) break;
            }
            if (j==0) arr.add(i);
        }
        System.out.println(arr);
    }
}

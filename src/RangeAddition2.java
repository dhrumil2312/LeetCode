import java.util.Arrays;
import java.util.Comparator;

public class RangeAddition2 {

    public static void main(String[] args) {

        int[][] ops = {{2,2},{3,3}};


        Arrays.sort(ops, Comparator.comparingInt(a -> a[0]));
        int r = ops[0][0];
        Arrays.sort(ops, Comparator.comparingInt(a -> a[1]));
        int c = ops[0][0];


    }
}

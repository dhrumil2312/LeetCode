public class MoveZeros {

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12,0};

        int i = nums.length -1;
        int zeroPointer = nums.length-1;

        while(i >= 0 ){
            if (nums[i] != 0){
                i--;
            }
            else{
                int j = i+1;
                while (j<=zeroPointer){
                    nums[j-1] = nums[j];
                    j++;
                }
                nums[j-1] = 0;
                zeroPointer--;
                i--;
            }
        }
    }

}

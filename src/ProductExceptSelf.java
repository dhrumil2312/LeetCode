public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] res = new int[nums.length];

        res[0] = 1;
        for(int i = 1 ; i < nums.length ; i++){
            res[i] = nums[i-1]*res[i-1];
        }

        int right = 1;
        for(int i = nums.length-1 ; i >=0 ; i--){
            res[i] *= right;
            right *= nums[i];
        }

        for(int a : res) System.out.print(a +" ");
    }
}



public class FlippingMatrix {


    static int[] reverse(int[] array){
        int left = 0;
        int right = array.length -1;
        while(left<right){
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }

        return array;
    }

    static int[] invert(int[] array){
        for(int i = 0 ; i < array.length ; i++){
            if(array[i] == 0){
                array[i] =1;
            }
            else{
                array[i] = 0;
            }
        }
        return array;
    }

    public static void main(String[] args) {

        int[][] array = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] res = new int[array.length][array.length];
        for(int[] sub : array){
            sub = reverse(sub);
            sub = invert(sub);
        }

        for(int[] sub : array){
            for(int s : sub){
                System.out.println(s);
            }
        }
    }
}

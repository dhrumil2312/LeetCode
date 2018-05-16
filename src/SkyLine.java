public class SkyLine {

    public static int[] maxRowWise(int[][] array){
        int[] res = new int[array.length];

        for(int i = 0; i < array.length ; i++){
            res[i] = array[i][0];
            for(int j = 0 ; j < array[i].length ; j++){
                res[i] = Math.max(res[i],array[i][j]);
            }
        }
        return res;
    }

    public static int[][] transpose(int[][] array){
        int[][] res = new int[array.length][array[0].length];
        for(int i = 0 ; i < array.length ; i++){
            for(int j =0 ; j<array[i].length ; j++){
                res[j][i] = array[i][j];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] grid = {{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}};
        int[] top = maxRowWise(grid);
        int[] left = maxRowWise(transpose(grid));

        int count = 0;
        for(int i =0 ; i < grid.length ; i++){
            for(int j = 0 ; j < grid[0].length ; j++){
                count += Math.min(left[i] , top[j]) - grid[i][j];
            }
        }
        System.out.println(count);

    }
}

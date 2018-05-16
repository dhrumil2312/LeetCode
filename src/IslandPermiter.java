public class IslandPermiter {
    public static void main(String[] args) {
        int[][] grid = {{0,1,0,0}, {1,1,1,0},{0,1,0,0}, {1,1,0,0}};

        int row = grid.length ;
        int col = grid[0].length;
        int cell = 0;
        int border = 0;

        for(int i = 0 ; i < row ; i++){
            for(int j =0 ; j < col ;j++){
                if(grid[i][j]==1){
                    cell+=1;
                    if(i+1 < row && grid[i+1][j] == 1) border+=1;
                    if(j+1 < col && grid[i][j+1] == 1) border+=1;
                }

            }
        }
        System.out.println(4*cell - 2*border);
    }
}



public class MaxAreaIsland_DFS {
    private static int floodfill(int[][] grid , int i , int j, int r , int c){
        if (i >= r || j >= c || j<0 || i <0 || grid[i][j] == 0)
            return 0;

        grid[i][j] = 0;
        return 1 + floodfill(grid , i+1 , j , r ,c) + floodfill(grid , i-1 , j , r, c) + floodfill(grid , i , j+1 , r, c) + floodfill(grid , i , j -1, r, c);

    }

    public static void main(String[] args) {

        int[][] grid = {{0,0,1,0,0,0,0,1,0,0,0,0,0},
 {0,0,0,0,0,0,0,1,1,1,0,0,0},
 {0,1,1,0,1,0,0,0,0,0,0,0,0},
 {0,1,0,0,1,1,0,0,1,0,1,0,0},
 {0,1,0,0,1,1,0,0,1,1,1,0,0},
 {0,0,0,0,0,0,0,0,0,0,1,0,0},
 {0,0,0,0,0,0,0,1,1,1,0,0,0},
 {0,0,0,0,0,0,0,1,1,0,0,0,0}};

        int row = grid.length;
        int col = grid[0].length;
        int ans = 0;
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                int c = floodfill(grid , i , j , row, col);
                ans = Math.max(ans ,c);
            }
        }
        System.out.println(ans);

    }
}

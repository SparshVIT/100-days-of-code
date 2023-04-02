class Solution {
    public int bs(int grid[], int low, int high){
        if(low<=high){
            int mid = low+(high-low)/2;
            if(grid[mid]<0){
                return 1+bs(grid,low,mid-1)+bs(grid,mid+1,high);
            }
            else if(grid[mid]>=0){
                return bs(grid,mid+1,high);
            }
        }
        return 0;
    }
    public int countNegatives(int[][] grid) {
        int count = 0;
        for(int i=0;i<grid.length;i++){
            int j = 0;
            int k = grid[i].length-1;
            count+= bs(grid[i],j,k);
        }
        return count;
    }
}

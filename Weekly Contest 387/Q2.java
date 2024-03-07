3070. Count Submatrices with Top-Left Element and Sum Less Than k

class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] sumMat=new int[n][m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0 && j==0){
                    sumMat[i][j]=grid[i][j];
                    continue;
                }
                if(i==0){
                    sumMat[i][j]=sumMat[i][j-1]+grid[i][j];
                }
                if(j==0){
                    sumMat[i][j]=sumMat[i-1][j]+grid[i][j];
                }
                if(i!=0 && j!=0){
                    sumMat[i][j]=sumMat[i-1][j]+sumMat[i][j-1]+grid[i][j]-sumMat[i-1][j-1];
                }
                
            }
        }
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(sumMat[i][j]<=k)cnt++;
            }
        }
        
        return cnt;
    }
}
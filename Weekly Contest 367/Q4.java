https://leetcode.com/contest/weekly-contest-367/problems/construct-product-matrix/
2906. Construct Product Matrix

class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] ans=new int[n][m];
        long mod=12345;
        
        int p=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans[i][j]=p;
                p=(int)(1L * p*grid[i][j]%mod);
            }
        }
        
        p=1;
        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                ans[i][j]=(int)(1L * ans[i][j] * p%mod);
                p=(int)(1L * p*grid[i][j]%mod);
            }
        }
        return ans;
    }
}
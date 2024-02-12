https://leetcode.com/contest/weekly-contest-384/problems/modify-the-matrix/
3033. Modify the Matrix

class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        
        int[] colmax=new int[n];
        
        int[][] ans=new int[m][n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans[i][j]=matrix[i][j];
                colmax[j]=Math.max(colmax[j],matrix[i][j]);
            }
        }
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==-1){
                    ans[i][j]=colmax[j];
                }
            }
        }
        
        return ans;
    }
}
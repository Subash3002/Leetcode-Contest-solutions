https://leetcode.com/contest/weekly-contest-367/problems/construct-product-matrix/
2906. Construct Product Matrix

class Solution {
public:
    vector<vector<int>> constructProductMatrix(vector<vector<int>>& grid) {
        const int mod=12345;
        int n=grid.size();
        int m=grid[0].size();
        vector<vector<int>> ans(n,vector<int>(m));
        
        int p=1;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans[i][j]=p;
                p=1L*p*grid[i][j]%mod;
            }
        }
        
        p=1;
        
        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                ans[i][j]=1L*ans[i][j]*p%mod;
                p=1L*p*grid[i][j]%mod;
            }
        }
        return ans;
    }
};
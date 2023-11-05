https://leetcode.com/contest/weekly-contest-370/problems/find-champion-i/
2923. Find Champion I


class Solution {
    public int findChampion(int[][] grid) {
        int[] ans=new int[grid.length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(i!=j){
                    if(grid[i][j]==1){
                        ans[i]+=1;
                    }else{
                        ans[j]+=1;
                    }
                }
                
            }
        }
        
        int max=0;
        int ind=-1;
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
            if(ans[i]>max){
                max=ans[i];
                ind=i;
            }
        }
        return ind;
    }
}
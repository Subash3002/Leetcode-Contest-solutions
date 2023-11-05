https://leetcode.com/contest/weekly-contest-370/problems/find-champion-ii/
2924. Find Champion II

class Solution {
    public int findChampion(int n, int[][] edges) {
        int[] team=new int[n];
        for(int i=0;i<edges.length;i++){
            team[edges[i][1]]=-1;
        }
        int c=0;
        int ind=-1;
        for(int i=0;i<n;i++){
            if(team[i]!=-1){
                c++;
                ind=i;
            }
            if(c>1){
                return -1;
            }
        }
        return ind;
    }
}
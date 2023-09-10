//https://leetcode.com/contest/weekly-contest-362/problems/determine-if-a-cell-is-reachable-at-a-given-time
//2849. Determine if a Cell Is Reachable at a Given Time

class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        int colDiff=Math.abs(sx-fx);
        int rowDiff=Math.abs(sy-fy);
        int maxCount=Math.max(rowDiff,colDiff);
        if(maxCount==0 && t==1)return false;
        if(maxCount<=t){
            return true;
        }
        return false;
        
    }
}
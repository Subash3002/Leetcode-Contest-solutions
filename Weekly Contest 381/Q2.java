3015. Count the Number of Houses at a Certain Distance I
https://leetcode.com/contest/weekly-contest-381/problems/count-the-number-of-houses-at-a-certain-distance-i/

class Solution {
    public int[] countOfPairs(int n, int x, int y) {
        int[] ans=new int[n];
        
        for(int i=1;i<=n;i++){
            for(int j=i+1;j<=n;j++){
                int d1=Math.abs(i-j);
                int d2=Math.abs(i-x)+Math.abs(j-y)+1;
                int d3=Math.abs(i-y)+Math.abs(j-x)+1;
                int minD=Math.min(d1,d2);
                minD=Math.min(minD,d3);
                ans[minD-1]+=2;
                
            }
        }
        return ans;
    }
}
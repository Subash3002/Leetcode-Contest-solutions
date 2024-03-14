3074. Apple Redistribution into Boxes

class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int cnt=0;
        int sum=0;
        for(int i:apple)sum+=i;
        
        for(int i=capacity.length-1;i>=0;i--){
            if(sum<=0)break;
            sum-=capacity[i];
            cnt++;
        }
        return cnt;
    }
}
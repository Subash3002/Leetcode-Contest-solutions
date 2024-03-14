3075. Maximize Happiness of Selected Children

class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        long ans=0;
        Arrays.sort(happiness);
        int dec=0;
        for(int i=happiness.length-1;i>=0;i--){
            if(k<=0)break;
            ans+=Math.max(0,happiness[i]-dec++);
            k--;
        }
        return ans;
    }
}
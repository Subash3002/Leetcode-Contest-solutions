https://leetcode.com/contest/weekly-contest-366/problems/minimum-processing-time/
2895. Minimum Processing Time

class Solution {
    public int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {
        Collections.sort(tasks);
        Collections.sort(processorTime);
        int ans=Integer.MIN_VALUE;
        int j=0;
        for(int i=tasks.size()-1;i>=0;i-=4){
            ans=Math.max(ans,tasks.get(i)+processorTime.get(j));
            j++;
            
        }
        if(tasks.size()%4!=0){
            ans=Math.max(ans,tasks.get(tasks.size()%4)+processorTime.get(j));
            
        }
        return ans;
    }
}
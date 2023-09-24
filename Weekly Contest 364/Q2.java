https://leetcode.com/contest/weekly-contest-364/problems/beautiful-towers-i/
2865. Beautiful Towers I

class Solution {
    public long maximumSumOfHeights(List<Integer> arr) {
        long maxSum=Long.MIN_VALUE;
        for(int i=0;i<arr.size();i++){
            long lSum=findLSum(arr,i);
            long rSum=findRSum(arr,i);
            long tSum=lSum+rSum+arr.get(i);
            maxSum=Math.max(maxSum,tSum);
        }
        return maxSum;
    }
    
    long findLSum(List<Integer> arr,int ind){
        long lSum=0;
        int cur=arr.get(ind);
        for(int i=ind-1;i>=0;i--){
            if(arr.get(i)<=cur){
                lSum+=arr.get(i);
                cur=arr.get(i);
            }else{
                lSum+=cur;
            }
        }
        return lSum;
    }
    
    long findRSum(List<Integer> arr,int ind){
        long rSum=0;
        int cur=arr.get(ind);
        for(int i=ind+1;i<arr.size();i++){
            if(arr.get(i)<=cur){
                rSum+=arr.get(i);
                cur=arr.get(i);
            }else{
                rSum+=cur;
            }
        }
        return rSum;
    }
}
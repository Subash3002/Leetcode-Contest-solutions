https://leetcode.com/contest/weekly-contest-367/problems/find-indices-with-index-and-value-difference-ii/
2905. Find Indices With Index and Value Difference II

class Solution {
    public int[] findIndices(int[] nums, int id, int vd) {
        int[] ans={-1,-1};
        TreeMap<Integer,Integer> mp=new TreeMap<>();
        
        for(int i=0;i<nums.length;i++){
            int j=i-id;
            if(j>=0){
                mp.put(nums[j],j);
                int min=mp.firstKey();
                int max=mp.lastKey();
                if(Math.abs(nums[i]-min)>=vd){
                    ans[0]=mp.get(min);
                    ans[1]=i;
                    return ans;
                }
                if(Math.abs(nums[i]-max)>=vd){
                    ans[0]=mp.get(max);
                    ans[1]=i;
                    return ans;
                }
            }
        }
        return ans;
    }
}
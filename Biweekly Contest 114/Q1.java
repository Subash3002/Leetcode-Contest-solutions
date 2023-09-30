https://leetcode.com/contest/biweekly-contest-114/problems/minimum-operations-to-collect-elements/
2869. Minimum Operations to Collect Elements

class Solution {
    public int minOperations(List<Integer> nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.size();i++){
            hm.put(nums.get(i),hm.getOrDefault(nums.get(i),0)+1);
        }
        
        for(int i=0;i<nums.size();i++){
            if(nums.get(i)<=k){
                if(hm.get(nums.get(i))<2){
                    return nums.size()-i;
                }
            }
            hm.put(nums.get(i),hm.get(nums.get(i))-1);
        }
        return 0;
    }
}
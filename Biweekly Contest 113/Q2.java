https://leetcode.com/contest/biweekly-contest-113/problems/minimum-array-length-after-pair-removals/
100020. Minimum Array Length After Pair Removals

class Solution {
    public int minLengthAfterRemovals(List<Integer> nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        
        for(int i=0;i<nums.size();i++){
            hm.put(nums.get(i),hm.getOrDefault(nums.get(i),0)+1);
        }
        
        int max=Collections.max(hm.values());
        
        int rem=nums.size()-max;
        
        if(nums.size()%2==0){
            if(max<=rem){
                return 0;
            }else{
                return max-rem;
            }
            
        }else{
            if(max<=rem){
                return 1;
            }else{
                return max-rem;
            }
        }
    }
}
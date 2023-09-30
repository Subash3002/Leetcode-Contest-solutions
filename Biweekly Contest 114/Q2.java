https://leetcode.com/contest/biweekly-contest-114/problems/minimum-number-of-operations-to-make-array-empty/
2870. Minimum Number of Operations to Make Array Empty

class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }else{
                hm.put(nums[i],1);
            }
        }
        int ops=0;
        for(Map.Entry<Integer,Integer> m:hm.entrySet()){
            int val=m.getValue();
            if(val==1) return -1;
            ops+=(val+2)/3;

        }


        return ops;
    }
}
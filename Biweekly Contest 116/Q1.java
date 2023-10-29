https://leetcode.com/contest/biweekly-contest-116/problems/subarrays-distinct-element-sum-of-squares-i/
2913. Subarrays Distinct Element Sum of Squares I

class Solution {
    public int sumCounts(List<Integer> nums) {
        int sum=0;
        for(int i=0;i<nums.size();i++){
            HashSet<Integer> hs=new HashSet<>();
            for(int j=i;j<nums.size();j++){
                hs.add(nums.get(j));
                sum+=hs.size()*hs.size();
            }
            //System.out.println(hs.size());
            
        }
        return sum;
    }
}
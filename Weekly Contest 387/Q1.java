https://leetcode.com/contest/weekly-contest-387/problems/distribute-elements-into-two-arrays-i/
3069. Distribute Elements Into Two Arrays I


class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> a=new ArrayList<>();
        List<Integer> b=new ArrayList<>();
        a.add(nums[0]);
        b.add(nums[1]);
        for(int i=2;i<nums.length;i++){
            if(a.get(a.size()-1)>b.get(b.size()-1))a.add(nums[i]);
            else b.add(nums[i]);
            
        }
        int n=nums.length;
        
        
        // System.out.println(a);
        // System.out.println(b);

        int[] res=new int[n];
        int ind=0;
        for(int i=0;i<a.size();i++){
            res[ind++]=a.get(i);
        }
        
        for(int i=0;i<b.size();i++){
            res[ind++]=b.get(i);
        }
        
        return res;

    }
}
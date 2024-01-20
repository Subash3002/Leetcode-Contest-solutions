3011. Find if Array Can Be Sorted
https://leetcode.com/contest/biweekly-contest-122/problems/find-if-array-can-be-sorted/

class Solution {
    int setbit(int num){
        int cnt=0;
        int n=num;
        while(n>0){
            if((n&1)!=0)cnt++;
            n=n>>1;
        }
        return cnt;
    }
    public boolean canSortArray(int[] nums) {
        int n=nums.length;
        int f=0;
        
        for(int i=1;i<n;i++){
            if(nums[i]<nums[i-1]){
                f=1;
                break;
            }
        }
        if(f==0)return true;
        HashMap<Integer,Integer> setBits=new HashMap<>();
        
        for(int i=0;i<n;i++){
            int val=setbit(nums[i]);
            //System.out.println(val);
            setBits.put(nums[i],val);
        }
        int ops=0;
        while(ops<nums.length){
            for(int i=1;i<n;i++){
                if(nums[i-1]>nums[i] && setBits.get(nums[i-1])==setBits.get(nums[i])){
                    int temp=nums[i];
                    nums[i]=nums[i-1];
                    nums[i-1]=temp;
                }
            }
            ops++;
        }
        
        //System.out.println(Arrays.toString(nums));
        for(int i=1;i<n;i++){
            if(nums[i]<nums[i-1]){
                return false;
            }
        }
        return true;
        
        
        
    }
}
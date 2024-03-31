class Solution {
    void doOR(int num,int[] arr,boolean cond){
        int ind=31;
        while(num>0){
            if(cond){
                arr[ind--]+=(num&1);
            }else{
                arr[ind--]-=(num&1);
            }
            num=num>>1;
        }
    }
    boolean checkOrMoreThanEqualK(int[] arr,int k){
        int OrSum=0;
        for(int i=31;i>=0;i--){
            if(arr[i]!=0)OrSum+=Math.pow(2,31-i);
        }
        return OrSum>=k;
    }
    public int minimumSubarrayLength(int[] nums, int k) {
        int ans=nums.length+1;
        int[] arr=new int[32];
        int i=0;
        int j=0;
        int n=nums.length;
        while(j<n){
            doOR(nums[j],arr,true);
            while(i<=j && checkOrMoreThanEqualK(arr,k)){
                ans=Math.min(ans,j-i+1);
                doOR(nums[i],arr,false);
                i++;
            }
            j++;
        }
        return ans<=nums.length?ans:-1;

    }
}
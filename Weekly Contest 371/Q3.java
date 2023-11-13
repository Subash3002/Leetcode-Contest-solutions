https://leetcode.com/contest/weekly-contest-371/problems/minimum-operations-to-maximize-last-elements-in-arrays/
2934. Minimum Operations to Maximize Last Elements in Arrays

class Solution {
    public int minOperations(int[] nums1, int[] nums2) {
        int ans=Integer.MAX_VALUE;
        int swaps=0;
        int n=nums1.length;
        for(int i=0;i<n-1;i++){
            if(nums1[i]<=nums1[n-1] && nums2[i]<=nums2[n-1]){}
            else if(nums1[i]<=nums2[n-1] && nums2[i]<=nums1[n-1]){
                swaps++;
            }else{
                swaps=Integer.MAX_VALUE;
                break;
            }
        }
        ans=Math.min(ans,swaps);
        swaps=1;
        int temp=nums1[n-1];
        nums1[n-1]=nums2[n-1];
        nums2[n-1]=temp;
        
        for(int i=0;i<n-1;i++){
            if(nums1[i]<=nums1[n-1] && nums2[i]<=nums2[n-1]){}
            else if(nums1[i]<=nums2[n-1] && nums2[i]<=nums1[n-1]){
                swaps++;
            }else{
                swaps=Integer.MAX_VALUE;
                break;
            }
        }
        
        ans=Math.min(ans,swaps);
        
        return ans>n?-1:ans;
    }
}
https://leetcode.com/contest/weekly-contest-367/problems/find-indices-with-index-and-value-difference-i/
2903. Find Indices With Index and Value Difference I

class Solution {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int[] ans=new int[2];
        ans[0]=-1;
        ans[1]=-1;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                int a1=Math.abs(nums[i]-nums[j]);
                int a2=Math.abs(i-j);
                //System.out.println(a1+" "+a1);
                if(a1>=valueDifference && a2>=indexDifference){
                    ans[0]=i;
                    ans[1]=j;
                    //System.out.println(ans[0]+" "+ans[1]);
                    return ans;
                }
                
            }
            
        }
        return ans;
    }
}
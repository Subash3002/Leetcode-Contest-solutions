3048. Earliest Second to Mark Indices I

class Solution {
    
    boolean check(int[] nums,int[] changeIndices,int m){
        
        int[] lastIdx=new int[nums.length];
        Arrays.fill(lastIdx,-1);
        
        for(int i=0;i<=m;i++){
            lastIdx[changeIndices[i]-1]=i;
        }
        int power=0;
        int marked=0;
        
        for(int i=0;i<=m;i++){
            if(i==lastIdx[changeIndices[i]-1]){
                if(nums[changeIndices[i]-1]>power)return false;
                power-=nums[changeIndices[i]-1];
                marked++;
            }else{
                power++;
            }
        }
        return marked==nums.length;
    }
    
    public int earliestSecondToMarkIndices(int[] nums, int[] changeIndices) {
        int n=nums.length;
        int m=changeIndices.length;
        int l=0;
        int h=m-1;
        int ans=-1;
        //Binary Search on answer
        while(l<=h){
            int mid=l+(h-l)/2;
            
            if(check(nums,changeIndices,mid)){
                ans=mid;
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        
        return ans==-1?-1:ans+1;
    }
}
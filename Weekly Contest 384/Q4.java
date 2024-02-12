https://leetcode.com/contest/weekly-contest-384/problems/number-of-subarrays-that-match-a-pattern-ii/
3036. Number of Subarrays That Match a Pattern II


class Solution {
    int[] KMP(String s){
        int n=s.length();
        int[] lps=new int[n];
        
        for(int i=1;i<n;i++){
            int preIdx=lps[i-1];
            
            while(preIdx>0 && s.charAt(i)!=s.charAt(preIdx)){
                preIdx=lps[preIdx-1];
            }
            
            lps[i]=preIdx+((s.charAt(i)==s.charAt(preIdx))?1:0);
        }
        
        return lps;
    }
    public int countMatchingSubarrays(int[] nums, int[] pattern) {
        int n=nums.length;
        int k=pattern.length;

        StringBuilder pS=new StringBuilder();
        StringBuilder nS=new StringBuilder();
        for(int i=0;i<k;i++){
            if(pattern[i]==1)pS.append("a");
            else if(pattern[i]==-1)pS.append("d");
            else pS.append("s");
            
        }
        for(int i=0;i<n-1;i++){
            if(nums[i]<nums[i+1])nS.append("a");
            else if(nums[i]>nums[i+1])nS.append("d");
            else nS.append("s");
        }
        String s=pS.toString()+"#"+nS.toString();
        // System.out.println(nS);
        // System.out.println(s);
        // System.out.println(s.length());
        int[] kmpArr=KMP(s);
        
        int ans=0;
        // System.out.println(Arrays.toString(kmpArr));
        // System.out.println(k);
        for(int i=k;i<kmpArr.length;i++){
            if(kmpArr[i]==k)ans++;
        }
        
        return ans;
    }
}
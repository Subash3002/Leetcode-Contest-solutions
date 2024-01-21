3014. Minimum Number of Pushes to Type Word I
https://leetcode.com/contest/weekly-contest-381/problems/minimum-number-of-pushes-to-type-word-i/

class Solution {
    public int minimumPushes(String word) {
        int[] arr=new int[26];
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            arr[c-'a']++;
        }
        int cnt=0;
        
        for(int i:arr){
            if(i!=0)cnt++;
        }
        int ans=0;
        int i=1;
        while(cnt>0){
            if(cnt<9){
                ans+=cnt*i;
            }else{
                ans+=8*i;
            }
            
            i++;
            cnt-=8;
        }
        return ans;
        
    }
}
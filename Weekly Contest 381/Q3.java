3016. Minimum Number of Pushes to Type Word II
https://leetcode.com/contest/weekly-contest-381/problems/minimum-number-of-pushes-to-type-word-ii/

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
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int ans=0;
        int ind=0;
        for(int i=25;i>=0;i--){
            if(arr[i]==0)break;
            ans+=(((ind)/8)+1)*arr[i];
            ind+=1;
        }
        return ans;
    }
}
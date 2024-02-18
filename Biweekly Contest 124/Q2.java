class Solution {
    public String lastNonEmptyString(String s) {
        int[] maxArr=new int[26];
        int[] freq=new int[26];
        int maxx=0;
        
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            freq[c-'a']++;
            maxx=Math.max(maxx,freq[c-'a']);
        }
        
        for(int i=0;i<26;i++){
            if(freq[i]==maxx){
                maxArr[i]=1;
            }
        }
        
        StringBuilder ans=new StringBuilder();
        
        for(int i=s.length()-1;i>=0;i--){
            char c=s.charAt(i);
            if(maxArr[c-'a']==1)ans.append(c);
            maxArr[c-'a']=0;
        }
        
        return ans.reverse().toString();
        
        
        
        
    }
}
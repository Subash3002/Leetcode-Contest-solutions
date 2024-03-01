3043. Find the Length of the Longest Common Prefix

class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<String> hs=new HashSet<>();
        int maxLen=0;
        for(int i=0;i<arr1.length;i++){
            String s=""+arr1[i];
            for(int j=0;j<s.length();j++){
                hs.add(s.substring(0,j+1));
            }
        }
        
        for(int i=0;i<arr2.length;i++){
            String s=""+arr2[i];
            for(int j=0;j<s.length();j++){
                String s2=s.substring(0,j+1);
                if(hs.contains(s2)){
                    maxLen=Math.max(maxLen,s2.length());
                }
            }
        }
        
        return maxLen;
        
        
        
    }
}
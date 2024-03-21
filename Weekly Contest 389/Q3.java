3085. Minimum Deletions to Make String K-Special

class Solution {
    public int minimumDeletions(String word, int k) {
        int[] f=new int[26];
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            f[c-'a']++;
        }
        System.out.println(Arrays.toString(f));
        int minn=Integer.MAX_VALUE;
        for(int i=0;i<26;i++){
            //System.out.println(i);
            int frq=f[i];
            int r=frq+k;
            if(frq==0)continue;
            int min=0;
            for(int j=0;j<26;j++){
        
                if(f[j]<frq)min+=f[j];
                else if(f[j]>r)min+=(f[j]-r);
                
            }
            //System.out.println(min+"*");
            minn=Math.min(minn,min);
        }
        return minn;
    }
}
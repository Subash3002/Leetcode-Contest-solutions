https://leetcode.com/contest/weekly-contest-382/problems/find-the-maximum-number-of-elements-in-subset/
3020. Find the Maximum Number of Elements in Subset

class Solution {
    public int maximumLength(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        int ans=1;
        for(int i:nums){
            if(i==1)continue;
            int cnt=1;
            //System.out.println(Math.sqrt(i));
            while((int)Math.sqrt(i)*(int)Math.sqrt(i)==i && hm.getOrDefault((int)Math.sqrt(i),0)>=2){
                cnt+=2;
                i=(int)Math.sqrt(i);
                //System.out.println("i "+i);
            }
            ans=Math.max(ans,cnt);
        }
        int maxOnes=(hm.getOrDefault(1,0)%2==0?hm.getOrDefault(1,0)-1:hm.getOrDefault(1,0));
        return Math.max(ans,maxOnes);
    }
}
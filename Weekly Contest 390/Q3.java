3092. Most Frequent IDs

class Solution {
    public long[] mostFrequentIDs(int[] nums, int[] freq) {
        HashMap<Long,Long> hm=new HashMap<>();
        TreeSet<long[]> st=new TreeSet<>((i,j)->{
            if(i[0]==j[0])return Long.compare(j[1],i[1]);
            return Long.compare(j[0],i[0]);
        });
        long[] ans=new long[nums.length];

        for(int i=0;i<nums.length;i++){
            long num=1L*nums[i];
            if(hm.containsKey(num)){
                long val=hm.get(num);
                st.remove(new long[]{val,num});
            }
            long upd=hm.getOrDefault(num,0L)+freq[i];
            upd=Math.max(upd,0L);
            hm.put(num,upd);
            st.add(new long[]{upd,num});

            ans[i]=st.first()[0];
        }
        return ans;
    }
}
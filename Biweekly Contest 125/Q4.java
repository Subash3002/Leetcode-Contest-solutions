3068. Find the Maximum Sum of Node Values

class Solution {
    public long maximumValueSum(int[] nums, int k, int[][] edges) {
        long ans=0;
        List<Integer> diff=new ArrayList<>();
        for(int i:nums){
            ans+=i;
            diff.add((i^k)-i);
        }
        Collections.sort(diff,Collections.reverseOrder());
        //System.out.println(diff);
        int i=0;
        int j=1;
        //System.out.println(ans);
        while(j<diff.size()){
            if(diff.get(i)+diff.get(j)<=0)break;
            ans+=diff.get(i)+diff.get(j);
            i+=2;
            j+=2;
        }
        
        return ans;
        
        
    }
}
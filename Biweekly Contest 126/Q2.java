3080. Mark Elements on Array by Performing Queries

class Solution {
   
    public long[] unmarkedSumArray(int[] nums, int[][] queries) {
        Comparator<int[]> customComparator = (a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            } else {
                return Integer.compare(a[1], b[1]);
            }
        };
        
        
        int n=nums.length;
        long[] ans=new long[queries.length];
        long sum=0;
        PriorityQueue<int[]> pq = new PriorityQueue<>(customComparator);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int[] l={nums[i],i};
            pq.offer(l);
        }
        int[] marked=new int[n];
        int itr=0;
        for(int[] q:queries){
            int ind=q[0];
            int k=q[1];
            if(marked[ind]==0){
                sum-=nums[ind];
                marked[ind]=1;
            }
            while(pq.size()>0 && k>0){
                int[] r=pq.poll();
                if(marked[r[1]]==0){
                    sum-=nums[r[1]];
                    marked[r[1]]=1;
                    k--;
                }
            }
            //System.out.println(sum);
            ans[itr++]=sum;
        }
        return ans;
    }
}
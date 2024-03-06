3066. Minimum Operations to Exceed Threshold Value II

class Solution {
    public int minOperations(int[] nums, int k) {
        //PriorityQueue<Integer> pq1=new PriorityQueue<Integer>(Collections.reverseOrder());
        PriorityQueue<Long> pq2=new PriorityQueue<Long>();

        int cnt=0;
        
        for(int i:nums){
            //pq1.add(i);
            pq2.add(1L*i);
        }
        
        while(!pq2.isEmpty() && pq2.size()>=2 && !(pq2.peek()>=1L*k)){
            cnt++;
            long x=pq2.poll();
            long y=pq2.poll();
            long newval=Math.min(x, y) * 2 + Math.max(x, y);
            
            pq2.add(newval);
            
        }
        
        return cnt;
        
    }
}
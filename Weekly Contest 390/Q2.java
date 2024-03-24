3091. Apply Operations to Make Sum of Array Greater Than or Equal to k

class Solution {
    public int minOperations(int k) {
        int min=k;
        for(int i=1;i<=k;i++){
            int ops=(i-1)+(int)Math.ceil((k-i)/(double)i);
            min=Math.min(ops,min);
        }
        return min;
    }
}
https://leetcode.com/contest/biweekly-contest-123/problems/find-the-number-of-ways-to-place-people-ii/
3027. Find the Number of Ways to Place People II

class Solution {
    public int numberOfPairs(int[][] points) {
        int n=points.length;
        //sorting the array based on 1st index and if same ,then sort the 2nd index which is larger
        Arrays.sort(points,new Comparator<int[]>(){
            public int compare(int[] a,int[] b){
                if(a[0]==b[0])return Integer.compare(b[1],a[1]);
                return Integer.compare(a[0],b[0]);
            }
        });
        int ans=0;
        
        for(int i=0;i<n;i++){//choosing the top element
            int max_so_far=Integer.MIN_VALUE;//try to choose the point which has max y than previous accepted
            for(int j=i+1;j<n;j++){//selecting whether the current element can be paired
                if(points[i][1]>=points[j][1]){
                    if(points[j][1]>max_so_far){
                        ans++;
                        max_so_far=points[j][1];//making the current y as max
                    }
                }
            }
        }
        
        return ans;
            
    }
}

class Solution {
public:
    static bool cmp(vector<int> &a,vector<int> &b){
        if(a[0]==b[0])return a[1]>b[1];
        return a[0]<b[0];
    }
    int numberOfPairs(vector<vector<int>>& points) {
        int ans=0;
        sort(points.begin(),points.end(),cmp);
        int n=points.size();
        for(int i=0;i<n;i++){
            int min_so_far=INT_MAX;
            for(int j=i-1;j>=0;j--){
                if(points[i][1]<=points[j][1]){
                    if(points[j][1]<min_so_far){
                        ans++;
                        min_so_far=points[j][1];
                    }
                }
            }
        }
        return ans;
    }
};
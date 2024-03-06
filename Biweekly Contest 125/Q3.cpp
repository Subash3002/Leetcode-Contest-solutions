3067. Count Pairs of Connectable Servers in a Weighted Tree Network

class Solution {
public:
    int dfs(int node,int curWeight,int par,vector<vector<int>>& adj,vector<vector<int>>& weight,int signalSpeed){
        int ans=0;
        for(int i=0;i<adj[node].size();i++){
            if(adj[node][i]==par)continue;
            ans+=dfs(adj[node][i],curWeight+weight[node][i],node,adj,weight,signalSpeed);
        }
        if(curWeight%signalSpeed==0)return ans+1;
        else return ans;
    }
    int calcTot(vector<int>& v){
        int sum=0;
        for(auto it:v)sum+=it;
        
        int ans=0;
        for(auto it:v)ans+=(sum-it)*it;
        
        return ans/2;
    }
    vector<int> countPairsOfConnectableServers(vector<vector<int>>& edges, int signalSpeed) {
        vector<vector<int>> adj(edges.size()+1,vector<int>());
        vector<vector<int>> weight(edges.size()+1,vector<int>());
        vector<int> cnt(edges.size()+1);
        
        for(auto it:edges){
            adj[it[0]].push_back(it[1]);
            adj[it[1]].push_back(it[0]);
            weight[it[0]].push_back(it[2]);
            weight[it[1]].push_back(it[2]);
        }
        
//         for(auto it:adj){
    
//             for(auto i:it)cout<<i<<" ";
//             cout<<endl;
//         }
        
        
        for(int i=0;i<edges.size()+1;i++){
            vector<int> v;
            for(int j=0;j<adj[i].size();j++){
                v.push_back(dfs(adj[i][j],weight[i][j],i,adj,weight,signalSpeed));
            }
            cnt[i]=calcTot(v);
        }
        
        return cnt;
        

    }
};
3081. Replace Question Marks in String to Minimize Its Value

class Solution {
public:
    int find(vector<int>& f){
        int ind=-1;
        int min=INT_MAX;
        for(int i=0;i<26;i++){
            if(f[i]<min){
                min=f[i];
                ind=i;
            }
        }
        return ind;
    }
    string minimizeStringValue(string s) {
        
        vector<char> arr;
        vector<int> f(26,0);
        
        vector<int> q;
        for(int i=0;i<s.length();i++){
            char c=s[i];
            if(c=='?'){
                q.push_back(i);
                continue;
            }
            f[c-'a']++;
        }
        
        for(int i=0;i<q.size();i++){
            int ind=find(f);
            arr.push_back((char)('a'+ind));
            f[ind]++;
            
        }
        sort(arr.begin(),arr.end());
        
        for(int i=0;i<q.size();i++){
                s[q[i]]=arr[i];
        }
        return s;
    }
};
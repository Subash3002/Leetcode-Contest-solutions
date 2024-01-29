https://leetcode.com/contest/weekly-contest-382/problems/alice-and-bob-playing-flower-game/
3021. Alice and Bob Playing Flower Game

class Solution {
    public long flowerGame(int n, int m) {
        long od1=(n+1)/2;
        long od2=(m+1)/2;
        long e1=n/2;
        long e2=m/2;
        
        return (od1*e2) + (od2*e1);
    }
}
class Solution {
public:
    int maxProfit(vector<int>& prices) {
        
        int mp=0;
        int n=prices.size();
        for(int i=0;i<n-1;i++)
        {
            int t=0;
            if(prices[i+1]>prices[i])
            mp+=(prices[i+1]-prices[i]);
        }
        return mp;
    }
};
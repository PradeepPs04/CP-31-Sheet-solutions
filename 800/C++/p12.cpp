#include<bits/stdc++.h>
using namespace std;

void solve() {
    int n;
    cin>>n;
    vector<int>arr(n);
    for(int i = 0; i < n; i++)  cin>>arr[i];

    vector<int>ans;
    ans.push_back(arr[0]);
    for(int i = 1; i < n; i++) {
        // if current number is greater or equal to previous number
        // than it follows the condition so pick it directly
        if(arr[i] >= arr[i-1])  ans.push_back(arr[i]);
        else {
            // otherwise there must be a number smaller or equal to current number 
            // so pick both
            ans.push_back(arr[i]);
            ans.push_back(arr[i]);
        }
    }

    cout<<ans.size()<<endl;
    for(auto it:ans)    cout<<it<<" ";
    cout<<endl; 
}

int main() {
    int t;
    cin>>t;
    while(t--)  solve();
    return 0;
}
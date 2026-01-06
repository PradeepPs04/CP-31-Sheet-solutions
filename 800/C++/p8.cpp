#include<bits/stdc++.h>
using namespace std;

void solve() {
    int n, k;
    cin>>n>>k;

    unordered_map<int, int>mpp;
    for(int i = 0; i < n; i++) {
        int num;
        cin>>num;
        mpp[num]++;
    }

    if(mpp[k])  cout<<"YES"<<endl;
    else    cout<<"NO"<<endl;
}

int main() {
    int t;
    cin>>t;
    while(t--)  solve();
    return 0;
}
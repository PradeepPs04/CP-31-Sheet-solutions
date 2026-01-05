#include<bits/stdc++.h>
using namespace std;

void solve() {
    int n;
    cin>>n;
    unordered_map<int, int>mpp;
    int num;
    for(int i = 0; i < n; i++) {
        cin>>num;
        mpp[num]++;
    }

    if(mpp.size() > 2)  cout<<"NO"<<endl;
    else if(mpp.size() <= 1)    cout<<"YES"<<endl;
    else {
        int freq1 = mpp[num];
        int freq2 = n-freq1;
        
        if(abs(freq1 - freq2) <= 1)  cout<<"YES"<<endl;
        else    cout<<"NO"<<endl;
    } 
}

int main() {
    int t;
    cin>>t;
    while(t--)  solve();
    return 0;
}
#include<bits/stdc++.h>
using namespace std;

void solve() {
    int x, k;
    cin>>x>>k; 
    // if we can directly go to the destination
    if(x % k != 0) {
        cout<<1<<endl;
        cout<<x<<endl;
    } else {
        // we can reach destination in 2 steps
        cout<<2<<endl;
        cout<<x-1<<" ";
        cout<<1<<endl;
    }
}

int main() {
    int t;
    cin>>t;
    while(t--)  solve();
    return 0;
}
#define ll long long

#include<bits/stdc++.h>
using namespace std;

void solve() {
    int n, k;
    cin>>n>>k;

    vector<ll>arr(n);
    for(int i = 0; i < n; i++)  cin>>arr[i];

    if(k == 1) {
        // check if sorted in non-decreasing order
        for(int i = 0; i < n-1; i++) {
            if(arr[i] > arr[i+1])   {
                cout<<"NO"<<endl;
                return;
            }
        }
    }

    // always possible
    cout<<"YES"<<endl;
}

int main() {
    int t;
    cin>>t;
    while(t--)  solve();
    return 0;
}
#include<bits/stdc++.h>
using namespace std;

void solve() {
    int n;
    cin>>n;
    vector<long>arr(n);
    for(int i = 0; i < n; i++) cin>>arr[i];

    long mini = LONG_MAX;
    for(int i = 1; i < n; i++) {
        // if already desorted
        if(arr[i] < arr[i-1]) {
            cout<<0<<endl;
            return;
        }

        mini = min(mini, (arr[i] - arr[i-1]) / 2 + 1);
    }

    cout<<mini<<endl;
}

int main() {
    int t;
    cin>>t;
    while(t--)  solve();
    return 0;
}
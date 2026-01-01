#include<bits/stdc++.h>
using namespace std;

void solve() {
    int n, x;
    cin>>n>>x;

    vector<int>arr(n);
    for(int i = 0; i < n; i++) cin>>arr[i];

    int mini_required = arr[0];

    for(int i = 0; i < n-1; i++) {
        int next_distance = arr[i+1] - arr[i];
        mini_required = max(mini_required, next_distance);
    }
    
    // distance between last gas station and destination
    int last_distance = x - arr[n-1];
    int last_required_fuel = 2 * last_distance;
    

    mini_required = max(mini_required, last_required_fuel);

    cout<<mini_required<<endl;
}

int main() {
    int t;
    cin>>t;
    while(t--)  solve();

    return 0;
}
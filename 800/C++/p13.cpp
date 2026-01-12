#include<bits/stdc++.h>
using namespace std;

void solve() {
    int n;
    cin>>n;
    vector<int>arr(n);
    for(int i = 0; i < n; i++)  cin>>arr[i];

    int maxi = *max_element(arr.begin(), arr.end());

    vector<int>first, second;

    for(int i = 0; i < n; i++) {
        if(arr[i] == maxi)  second.push_back(arr[i]);
        else    first.push_back(arr[i]);
    }

    // if all elements are equal to maxi
    if(first.size() == 0)   cout<<-1<<endl;
    else {
        cout<<first.size()<<" "<<second.size()<<endl;
        for(auto it:first)  cout<<it<<" ";
        cout<<endl;
        for(auto it:second) cout<<it<<" ";
        cout<<endl;
    }
}

int main() {
    int t;
    cin>>t;
    while(t--)  solve();
    return 0;
}
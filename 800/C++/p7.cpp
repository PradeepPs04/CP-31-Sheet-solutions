#include<bits/stdc++.h>
using namespace std;

int helper(string a, string b, int idx) {
    int op = 0;
    int j = 0;
    while(j < b.length()) {
        if(idx == a.length()) {
            a += a;
            op++;
        }

        if(a[idx] != b[j])    return INT_MAX;

        idx++; j++;
    }

    return op;
}

void solve() {
    int n, m;
    cin>>n>>m;

    string a, b;
    cin>>a>>b;

    int mini = INT_MAX;
    for(int i = 0; i < n; i++) {
        if(a[i] == b[0]) {
            mini = min(mini, helper(a, b, i));
        }
    }

    if(mini == INT_MAX) cout<<-1<<endl;
    else    cout<<mini<<endl;
}

int main() {
    int t;
    cin>>t;
    while(t--)  solve();
    return 0;
}
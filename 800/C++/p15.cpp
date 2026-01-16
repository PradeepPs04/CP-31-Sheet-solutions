#include<bits/stdc++.h>
using namespace std;

void solve() {
    int n;
    cin>>n;

    int oddCnt = 0;
    for(int i = 0; i < n; i++) {
        int num;
        cin>>num;

        oddCnt += (num & 1);
    }

    if(oddCnt & 1)  cout<<"No"<<endl;
    else    cout<<"Yes"<<endl;
}

int main() {
    int t;
    cin>>t;
    while(t--)  solve();
    return 0;
}
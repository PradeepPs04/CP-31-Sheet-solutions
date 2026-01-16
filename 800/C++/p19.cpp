#include<bits/stdc++.h>
using namespace std;

void solve() {
    int n;
    cin>>n;
    int negCnt = 0;
    for(int i = 0; i < n; i++) {
        int num;
        cin>>num;
        negCnt += (num == -1);
    } 

    int posCnt = n - negCnt;

    // if +ve's are more or equal to -ve's 
    if(posCnt >= negCnt) {
        // if number of -ve's are even => we do not need to do anything
        if(negCnt % 2 == 0) cout<<0<<endl;
        // convert 1 -ve to +ve to make -ve count even
        else cout<<1<<endl;
    } else {
        // make +ve's and -ve's equal
        int diff = negCnt - posCnt;
        int moves = (diff + 1) / 2;
        // if remaining -ve's are odd => convert 1 -ve to +ve
        if((negCnt-moves) % 2 != 0) moves++;

        cout<<moves<<endl;
    }
}

int main() {
    int t;
    cin>>t;
    while(t--)  solve();
    return 0;
}
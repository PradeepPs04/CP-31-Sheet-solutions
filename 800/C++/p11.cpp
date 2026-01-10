#include<bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin>>n;
    
    int mini = INT_MAX;
    for(int i = 0; i < n; i++) {
        int num;
        cin>>num;
        mini = min(mini, abs(abs(num)-0));
    }

    cout<<mini<<endl;

    return 0;
}
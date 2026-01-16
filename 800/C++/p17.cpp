#include<bits/stdc++.h>
using namespace std;

void solve() {
    int n, k, x;
    cin>>n>>k>>x;
    
    // we can use all 1's to create 'n'
    if(x != 1) {
        cout<<"YES"<<endl;
        cout<<n<<endl;
        while(n--)  cout<<1<<" ";
        cout<<endl;
    } else {
        // if only 1 option was to use 1 and that was not allowed because of x
        // or we can only use 2 but n is odd
        if(k == 1 || (k == 2 && n % 2 == 1))    cout<<"NO"<<endl;
        else {
            // if n is even we can use n/2 number of 2's
            if(n % 2 == 0) {
                cout<<"YES"<<endl;
                cout<<n/2<<endl;
                for(int i = 0; i < n/2; i++)    cout<<2<<" ";
                cout<<endl;
            } else {
                // if n is odd use one 3 and rest 2's
                cout<<"YES"<<endl;
                cout<<(n-3)/2 + 1<<endl;
                for(int i = 0; i < (n-3)/2; i++)    cout<<2<<" ";
                cout<<3<<endl;
            }
        }
    }
}

int main() {
    int t;
    cin>>t;
    while(t--)  solve();

    return 0;
}
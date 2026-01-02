#include<bits/stdc++.h>
using namespace std;

void solve() {
    int n;
    cin>>n;

    string s;
    cin>>s;

    int count = 0;

    int i = 0;
    while(i < n) {
        if(s[i] == '.') {
            int j = i+1;
            while(j < n && s[j] == '.') j++;
            
            // if there are a least 3 consecutive empty cells
            // we can create unlimited water source using 2 cells
            // after that we can perform 2nd action to fill all the remaining cells
            if(j - i >= 3) {
                count = 2;
                break;
            } else {
                // not possible to create unlimited water source
                count += (j-i);
            }

            i = j+1;
        } else {
            // blocked cell
            i++;
        }
    }
    
    cout<<count<<endl;
}

int main() {
    int t;
    cin>>t;
    while(t--)  solve();
    return 0;
}
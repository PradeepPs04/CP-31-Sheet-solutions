#include<bits/stdc++.h>
using namespace std;

void solve(vector<vector<int>>& score) {
    int totalScore = 0;
    char ch;
    for(int i = 0; i < 10; i++) {
        for(int j = 0; j < 10; j++) {
            cin>>ch;
            if(ch == 'X')   totalScore += score[i][j];
        }
    }

    cout<<totalScore<<endl;
}

int main() {
    vector<vector<int>>score = {
        {1,1,1,1,1,1,1,1,1,1},
        {1,2,2,2,2,2,2,2,2,1},
        {1,2,3,3,3,3,3,3,2,1},
        {1,2,3,4,4,4,4,3,2,1},
        {1,2,3,4,5,5,4,3,2,1},
        {1,2,3,4,5,5,4,3,2,1},
        {1,2,3,4,4,4,4,3,2,1},
        {1,2,3,3,3,3,3,3,2,1},
        {1,2,2,2,2,2,2,2,2,1},
        {1,1,1,1,1,1,1,1,1,1},
    };
    int t;
    cin>>t;
    while(t--)  solve(score);
}
#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin>>t;
    while(t--!=0){
        int x,y,z;
        cin>>x>>y>>z;
        if (z<x-1) cout<<"No"<<endl;
        else if(z==x-1){
            if (y==0) cout<<"Yes"<<endl;
            else cout<<"No"<<endl;
        }
        else cout<<"Yes"<<endl;
    }
}

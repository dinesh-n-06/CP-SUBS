#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin>>t;
    while(t--!=0){
        int a,b;
        cin>>a>>b;
        int ans=0;
        if (a%2!=0) ans++;
        if (b%2!=0) ans++;
        cout<<ans<<endl;
    }
}

#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin>>t;
    while(t--!=0){
        int n,ans=0;
        cin>>n;
        for (int i=1;i<=n;i++){
            if (i*i<=n){
                ans = i*i;
            }
        }
        cout<<ans<<endl;
    }
}

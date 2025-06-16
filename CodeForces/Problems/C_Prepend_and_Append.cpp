#include <bits/stdc++.h>
using namespace std;

int main() {

    int t;
    cin >> t;
    while (t-- != 0) {
        int n;
        cin >> n;
        string s;
        cin>>s;
        int ans = n,lo = 0,hi = n-1;
        while (lo<=hi){
            if (s[lo]== s[hi]) break;
            else{
                lo++; hi--;
                ans-=2;
            }
        }
        
        cout<<ans<<endl;
    }
    return 0;
}
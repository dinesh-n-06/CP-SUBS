#include <bits/stdc++.h>
using namespace std;

int main() {

    int t;
    cin >> t;
    while (t-- != 0) {
        int n,k;
        cin >> n >> k;
        if (n%2==0){
            if (n/2==k) cout<<"YES"<<endl;
            else cout<<"NO"<<endl;
        }
        else {
        if (n/2==k || (n/2)+1 == k){
            cout<<"YES"<<endl;
        }
        else cout<<"NO"<<endl;
    }
    }

    return 0;
}
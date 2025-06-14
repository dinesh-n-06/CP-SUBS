#include <bits/stdc++.h>
using namespace std;
#define int long long
int32_t main() {
    int t;
    cin >> t;
    while (t-- != 0) {
        int n,k;
        cin >> n>>k;
        cout<<((n%2==0 || (n-k)%2==0)?"YES":"NO")<<endl;
    }

    return 0;
}
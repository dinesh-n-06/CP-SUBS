#include <bits/stdc++.h>
using namespace std;
#define int long long

int32_t main() {

    int t;
    cin >> t;
    while (t-- != 0) {
        int n,k,x;
        cin >> n >> x >> k;
        if(2*k>=x*(x+1) && 2*k<=n*(n+1)-(n-x)*(n-x+1)){  
			cout << "YES\n";
		}
		else cout << "NO\n";
    }
}
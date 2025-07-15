#include <bits/stdc++.h>
using namespace std;
#define int long long

int32_t main() {

    int t;
    cin >> t;
    while (t-- != 0) {
        int a, b, n;
        cin >> a >> b >> n;
        int arr[n];
        for(int i=0;i<n;i++){
            cin >> arr[i];
        }
        int ans=0;
        for(int i=0;i<n;i++){
            ans+=min(arr[i],a-1);
        }
        cout<<ans+b<<endl;
    }
    return 0;
}
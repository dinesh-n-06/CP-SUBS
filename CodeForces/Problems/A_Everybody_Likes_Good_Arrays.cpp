#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin >> t;
    while (t-- != 0) {
        int n;
        cin >> n;
        int arr[n];
        for(int i=0;i<n;i++){
            cin>>arr[i];
        }
        int ans=0;
        for(int i=0;i<n-1;i++){
            if(arr[i]%2==arr[i+1]%2) ans++;
        }
        cout<<ans<<endl;
    }
    return 0;
}
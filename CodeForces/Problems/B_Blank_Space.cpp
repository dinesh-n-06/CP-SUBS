#include <bits/stdc++.h>
using namespace std;

int main() {

    int t;
    cin >> t;
    while (t-- != 0) {
        int n;
        cin >> n;
        vector<int> arr(n);
        for (int i=0;i<n;i++){
            cin>>arr[i];
        }
        int ans = 0,count=0;
        for (int i:arr){
            if (i==0){
                count++;
                ans = max(count,ans);
            }
            else count=0;
        }
        cout<<ans<<endl;
    }

    return 0;
}
#include <bits/stdc++.h>
using namespace std;

int main() {

    int t;
    cin >> t;
    while (t-- != 0) {
        int n;
        cin >> n;
        int arr[n];
        int count = 0;
        int pre[n];
        for (int i=0;i<n;i++){
            cin>>arr[i];
            if (arr[i]==2) {
                count++;
            }
            else pre[i] = count;
        }
        if (count%2!=0) cout<<-1<<endl;
        else{
            int ans = 1;
            int curr=0;
            for (int i=0;i<n;i++){
                if (arr[i]==2){
                curr++;
                if (curr==count-curr){
                    ans = i+1;
                    break;
                    
                }
            }
        }
        cout<<ans<<endl;
        }
    }

    return 0;
}
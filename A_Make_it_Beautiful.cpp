#include <bits/stdc++.h>
using namespace std;

int main() {

    int t;
    cin >> t;
    while (t-- != 0) {
        int n;
        cin >> n;
        int arr[n];
        for (int i=0;i<n;i++){
            cin>>arr[i];
        }
        sort(arr,arr+n);
        if (arr[0]==arr[n-1]) cout<<"NO"<<endl;
        else{
            swap(arr[1],arr[0]);
            swap(arr[n-1],arr[0]);
            cout<<"YES"<<endl;
            for (int i:arr){
                cout<<i<<" ";
            }
            cout<<endl;
        }
    }
    return 0;
}
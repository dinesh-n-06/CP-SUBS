#include <bits/stdc++.h>
using namespace std;

int main() {

    int t;
    cin >> t;
    while (t-- != 0) {
        int n;
        cin >> n;
        int arr[n];
        bool flag=false;
        for (int i=0;i<n;i++){
            cin>> arr[i];
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (__gcd(arr[i], arr[j])<=2){
                    flag = true;
                }
            }
        }
        cout<< ((flag)?"Yes":"No")<< endl;
        
    }

    return 0;
}
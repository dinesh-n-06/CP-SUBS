#include <bits/stdc++.h>
using namespace std;
#define int long long

bool check(int n){
    string str = to_string(n);
    int len = str.size();
    int count=0;
    for (int i=0;i<len;i++){
        if (str[i]=='0') count++;
    }
    return (count==len-1);
}

int32_t main() {
    vector<int> count;
    for (int i=1;i<=999999;i++){
        if (check(i)==true){
            count.push_back(i);
        }
    }
    int t;
    cin >> t;
    while (t-- != 0) {
        int n;
        cin >> n;
        int ans=0;
        for (int i=0;i<count.size();i++){
            if (count[i]<=n) ans++;
            else break;
        }
        cout<<ans<<endl;
    }
    return 0;
}
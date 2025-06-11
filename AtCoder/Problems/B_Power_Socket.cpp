#include <bits/stdc++.h>
using namespace std;

int main() {
    int a,b;
    cin >> a>>b;
    int i = 1;
    int ans = 0;
    while (i<b){
        i--;
        i+=a;
        ans++;
    }
    cout<<ans<<endl;
    return 0;
}
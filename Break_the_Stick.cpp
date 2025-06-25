#include <bits/stdc++.h>
using namespace std;

int main() {

    int t;
    cin >> t;
    while (t-- != 0) {
        int n,x;
        cin >> n >> x;
        cout<<((n%2==0 || n%2==x%2)?"YES":"NO")<<endl;
    }
    return 0;
}
#include <bits/stdc++.h>
using namespace std;

int main() {

    int n;
    cin >> n;
    if (n<=50){
        cout<<100<<endl;
    }
    else if (n>50 && n<=100){
        cout<<50<<endl;
    }
    else cout<<0<<endl;

    return 0;
}
#include <bits/stdc++.h>
using namespace std;

int gcd(int a,int b){
    if (b==0) return a;
    return gcd(b,a%b);
}

int main() {
    int t;
    cin>>t;
    while(t--!=0){
        int a,b;
        cin>>a>>b;
        if (gcd(a,b)>1) cout<<0<<endl;
        else if (gcd(a,b+1)>1) cout<<1<<endl;
        else if (gcd(a+1,b)>1) cout<<1<<endl;
        else cout<<2<<endl; 
    }
}

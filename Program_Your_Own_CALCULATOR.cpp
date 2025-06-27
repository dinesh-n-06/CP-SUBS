#include <bits/stdc++.h>
using namespace std;

int main() {
    double a,b;
    cin>>a>>b;
    char op;
    cin >> op;
    if (op == '+'){
        cout<< a+b << endl;
    }
    else if(op == '-'){
        cout<< a-b << endl;
    }
    else if(op == '*'){
        cout<< a*b<<endl;
    }
    else cout << fixed << setprecision(7) << a/b << endl;
}

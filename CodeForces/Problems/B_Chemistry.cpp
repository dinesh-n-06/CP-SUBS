#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin >> t;
    while (t-- != 0) {
        int n, k;
        cin >> n >> k;
        string s;
        cin >> s;
        map<char,int> hm;
        for (char i:s){
            if (hm.count(i)!=0){
                hm[i]++;
            }
            else hm[i]=1;
        }
        int count = 0;
        for (auto &it:hm){
            if (it.second % 2 != 0) count++;
        }
        cout << ((count>k+1)?"NO":"YES") << endl;
    }

    return 0;
}
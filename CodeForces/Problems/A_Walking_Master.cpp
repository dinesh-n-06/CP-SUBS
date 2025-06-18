#include <bits/stdc++.h>
using namespace std;

int main() {

    int t;
    cin >> t;
    while (t-- != 0) {
        int sx,sy,dx,dy;
        cin >> sx >> sy >> dx >> dy;
        int moves = 0;
        if (dy<sy) cout << -1 << endl;
        else{
            int m = dy-sy;
            moves+=m;
            sx+=m;
            if (dx>sx) cout << -1 <<endl;
            else{
                moves+=(sx-dx);
                cout<<moves<<endl;
            }
        }
        
        
        
    }

    return 0;
}
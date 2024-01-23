#include <iostream>
#include <algorithm>
using namespace std;

int main() {
    int a[8]={1,2,3,4,5,6,7,8};
    int b[8]={8,7,6,5,4,3,2,1};
    int c[8]={0,};
    for(int i=0; i<8; i++){
        cin>>c[i];
    }
    if (equal(a, a+8, c))  cout << "ascending";
    else if (equal(b, b+8, c))  cout << "descending";
    else cout<<"mixed";
}

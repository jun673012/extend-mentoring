#include <iostream>
#include <string>
#include <algorithm>
using namespace std;
int main(){
    string a,b;
    cin>>a;
    b=a;
    reverse(a.begin(),a.end());
    if(b.compare(a)==0) cout<<1;
    else cout<<0;
}

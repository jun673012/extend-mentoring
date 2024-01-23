#include <iostream>
#include <string>
#include <algorithm>
using namespace std;
int main(){
    string a,b,c;
    cin>>a>>b;
    reverse(a.begin(),a.end());
    reverse(b.begin(),b.end());
    int x=stoi(a);
    int y=stoi(b);
    c=to_string(x+y);
    reverse(c.begin(),c.end());
    int z=stoi(c);
    cout<<z;
}

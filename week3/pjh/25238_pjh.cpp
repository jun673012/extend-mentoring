#include <iostream>
#include <string>
#include <algorithm>
using namespace std;
int main(){
    int a,b,result;
    cin>>a>>b;
    result=a*(100-b)/100;
    if(result<100) cout<<1;
    else cout<<0;
}

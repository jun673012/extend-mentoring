#include <iostream>
#include <cmath>
using namespace std;
int main(){
    unsigned long long a,b,i;
    cin>>a>>b;
    if(a==b){
        cout<<0<<endl;
        return 0;
    }
    int j=b-a;
    cout<<abs(j)-1<<endl;
    for (i=1; i<abs(j);i++){
        if(b>a)cout<<a+i<<" ";
        if(a>b)cout<<b+i<<" ";
    }
    return 0;
}

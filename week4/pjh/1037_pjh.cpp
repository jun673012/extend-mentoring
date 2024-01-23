#include <iostream>

using namespace std;
int main(){
    int x,max=0,min=1000000;
    cin>>x;
    for(int i=0; i<x; i++){
        int a;
        cin>>a;
        if(x==1){
            cout<<a*a;
            return 0;
        }
        if(max<a) max=a;
        if(min>a) min=a;
    }
    cout<<max*min;
}

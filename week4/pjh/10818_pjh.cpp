#include <iostream>

using namespace std;
int main(){
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    int x,max=-1000000,min=1000000;
    cin>>x;
    for(int i=0; i<x; i++){
        int a;
        cin>>a;
        if(max<a) max=a;
        if(min>a) min=a;
    }
    cout<<min<<" "<<max;
}

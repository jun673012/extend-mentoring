#include <iostream>
using namespace std;
int main(){
    int a,b;
    cin>>a>>b;
    for(int i=0; i<a; i++){
        int x;
        cin>>x;
        if(b>x) cout<<x<<" ";
    }
}

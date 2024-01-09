#include <iostream>
using namespace std;
int main(){
    int n,y=0,m=0;
    cin>>n;
    for (int i=0; i<n; i++){
        int x;
        cin>>x;
        y+=(x/30+1)*10;
        m+=(x/60+1)*15;
    }
    if(y<m) cout<<"Y "<<y;
    if(y>m) cout<<"M "<<m;
    if(y==m) cout<<"Y M "<<y;
}

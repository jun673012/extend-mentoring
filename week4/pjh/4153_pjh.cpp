#include <iostream>
#include <algorithm>
using namespace std;
int main(){
    while(1){
        int a[3]={0,};
        int x,y,z;
        cin>>a[0]>>a[1]>>a[2];
        if(a[0]==0&&a[1]==0&&a[2]==0) return 0;
        sort(a,a+3);
        x=a[2]*a[2];
        y=a[1]*a[1];
        z=a[0]*a[0];
        if(x==y+z) cout<<"right"<<endl;
        else cout<<"wrong"<<endl;
    }
}

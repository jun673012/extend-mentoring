#include <iostream>

using namespace std;
int main(){
    int h,ch,m,d,r,t;
    cin>>h>>m>>t;
    if(m+t<60)
        cout<<h<<" "<<m+t;
    if(m+t>=60){
        d=(m+t)/60;
        r=(m+t)%60;
        ch=h+d;
        if(ch>=24){
            cout<<ch-24<<" "<<r;
            return 0;
        }
        cout<<ch<<" "<<r;
    }
    return 0;
}

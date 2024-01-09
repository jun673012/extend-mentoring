#include <iostream>
using namespace std;
int main(){
    int h, m, s, d;
    cin>>h>>m>>s>>d;
    cout<<(h+(m+(s+d)/60)/60)%24<<" "<<(m+(s+d)/60)%60<<" "<<(s+d)%60;
    return 0;
}//제출본(답지)
#include <iostream>

using namespace std;
int main(){
    int h,m,s,t;
    int ds,rs,am;
    cin>>h>>m>>s>>t;
    ds=(s+t)/60;
    rs=(s+t)%60;
    am=m+ds;
    if(s+t<60)
        cout<<h<<" "<<m<<" "<<s+t;
    if(s+t>=60){
        if(am>=60){
            if(h+(am/60)>=24){
                cout<<(h+(am/60))%24<<" "<<am%60<<" "<<rs;
                return 0;
            }
            cout<<h+(am/60)<<" "<<am%60<<" "<<rs;
            return 0;
        }
        cout<<h<<" "<<am<<" "<<rs;
    }
    return 0;
}//내 코드(성공)

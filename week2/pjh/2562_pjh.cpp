#include <iostream>
#include <algorithm>
using namespace std;
int main(){
    int a,max=0,num;
    for(int i=0; i<9;i++){
        cin>>a;
        if(a>max){
            max=a;
            num=i+1;
        }
        
    }
    cout<<max<<"\n"<<num;
}

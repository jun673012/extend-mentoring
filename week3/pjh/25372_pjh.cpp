#include <iostream>
#include <string>
#include <algorithm>
using namespace std;
int main(){
    int x;
    cin>>x;
    for (int i=0; i<x; i++){
        string a;
        cin>>a;
        if(a.length()>=6&&a.length()<=9){
            cout<<"yes"<<endl;
        }
        else{
            cout<<"no"<<endl;
        }
    }
}

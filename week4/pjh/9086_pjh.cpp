#include <iostream>
#include <string>
#include <algorithm>
using namespace std;
int main(){
    int x;
    cin>>x;
    for(int i=0; i<x;i++){
        string a;
        cin>>a;
        cout<<a[0]<<a[a.size()-1]<<endl;
    }
    
}

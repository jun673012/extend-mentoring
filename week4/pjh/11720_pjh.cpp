#include <iostream>
#include <string>
#include <algorithm>
using namespace std;
int main(){
    int x,sum=0;
    cin>>x;
    string a;
    cin>>a;
    for(int i=0; i<a.size();i++){
        sum=sum+(a[i]-48);
    }
    cout<<sum;
}

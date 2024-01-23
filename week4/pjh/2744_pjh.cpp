#include <iostream>
#include <string>
#include <cctype>
using namespace std;

int main(){
    string a;
    cin>>a;
    for(int i=0; i<a.size();i++){
        if(isupper(a[i])!=0) a[i]=tolower(a[i]);
        else a[i]=toupper(a[i]);
    }
    cout<<a;
}

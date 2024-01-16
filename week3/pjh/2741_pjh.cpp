#include <iostream>
using namespace std;
int main(){
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    int a;
    cin>>a;
    for(int i=a-1; i>=0;i--){
        cout<<a-i<<"\n";
    }
}

#include <iostream>

using namespace std;
int main(){
    int x;
    cin>>x;
    for(int i=0; i<x; i++){
        int a;
        cin>>a;
        cout<<a/25<<" "<<(a%25)/10<<" "<<((a%25)%10)/5<<" "<<(((a%25)%10)%5)/1<<endl;
    }
}

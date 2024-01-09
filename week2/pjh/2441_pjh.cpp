#include <iostream>
using namespace std;
int main(){
    int a;
    cin>>a;
    for (int i=0; i<a; i++){
        for(int k=0; k<=i-1; k++){
            cout<<" ";
        }
        for (int j=0; j<=a-i-1; j++){
            cout<<"*";
        }
        cout<<"\n";
    }
}

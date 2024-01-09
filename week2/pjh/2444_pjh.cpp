#include <iostream>
using namespace std;
int main(){
    int a;
    cin>>a;
//웟 5별
    for (int i=0; i<a; i++){
        for(int k=0; k<=a-i-2; k++){
            cout<<" ";
        }
        for (int j=0; j<=i*2; j++){
            cout<<"*";
        }
        cout<<"\n";
    }
//아래 5별
    for (int i=0; i<a-1; i++){
        for(int k=0; k<=i; k++){
            cout<<" ";
        }
        for (int j=0; j<=2*(a-2-i); j++){
            cout<<"*";
        }
        cout<<"\n";
    }
}

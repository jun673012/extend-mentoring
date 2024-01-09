#include <iostream>
using namespace std;
int main(){
    int a;
    cin>>a;
//역삼각
    for (int i=0; i<a; i++){
        for(int k=0; k<=i-1; k++){
            cout<<" ";
        }
        for (int j=0; j<=2*a-2-2*i; j++){
            cout<<"*";
        }
        cout<<"\n";
    }
//삼각
    for (int i=0; i<a-1; i++){
        for(int k=0; k<=a-i-3; k++){
            cout<<" ";
        }
        for (int j=0; j<=i*2+2; j++){
            cout<<"*";
        }
        cout<<"\n";
    }

}

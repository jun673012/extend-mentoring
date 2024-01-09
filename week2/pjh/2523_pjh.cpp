#include <iostream>
using namespace std;
int main(){
    int a;
    cin>>a;
//삼각
    for (int i=0; i<a; i++){
        for(int k=0; k<=i; k++){
            cout<<"*";
        }
        cout<<"\n";
    }
    for (int i=a-1; i>0; i--){
        for(int k=i; k>0; k--){
            cout<<"*";
        }
        cout<<"\n";
    }

}

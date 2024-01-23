#include <iostream>

using namespace std;
int main(){
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    int x;
    cin>>x;
    for(int i=0; i<x; i++){
        int min=100,add=0;
        for(int j=0; j<7; j++){
            int a;
            cin >> a;
            if(a%2==0){
                add+=a;
                if(min>a) min=a;
            }
        }
        cout<<add<<" "<<min<<"\n";
    }
}

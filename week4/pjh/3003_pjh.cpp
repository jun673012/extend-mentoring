#include <iostream>
using namespace std;

int main() {
    int x[6]={1,1,2,2,2,8};
    int y[6]={0,};
    for(int i=0; i<6; i++){
        int a;
        cin>>a;
        y[i]=x[i]-a;
        cout<<y[i]<<" ";
    }
}

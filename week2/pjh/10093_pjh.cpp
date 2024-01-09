#include <iostream>
using namespace std;
int main(){
    unsigned long long a,b;
    cin>>a>>b;
    cout<<b-a-1<<endl;
    for (int i=1; i<b-a;i++){
        cout<<a+i<<" ";
    }
}

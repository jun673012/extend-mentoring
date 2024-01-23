#include <iostream>
using namespace std;
unsigned long long f(int a){
    if(a<=1) return a;
    else return f(a-1)+f(a-2);
}
int main(){
    int a;
    cin>>a;
    cout<<f(a);

}

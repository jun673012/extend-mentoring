#include <iostream>
using namespace std;
int main(){
    int a;
    cin>>a;
    if(a<=100&&a>=90)
        cout<<"A";
    if(a<=89&&a>=80)
        cout<<"B";
    if(a<=79&&a>=70)
        cout<<"C";
    if(a<=69&&a>=60)
        cout<<"D";
    if(a<=59)
        cout<<"F";
}

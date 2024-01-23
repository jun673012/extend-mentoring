#include <iostream>

using namespace std;
int main(){
    int a,b,a500,a100,a50,a10,a5,a1;
    cin>>b;
    a=1000-b;
    a500=a/500;
    a100=(a%500)/100;
    a50=((a%500)%100)/50;
    a10=(((a%500)%100)%50)/10;
    a5=((((a%500)%100)%50)%10)/5;
    a1=((((a%500)%100)%50)%10)%5;
    cout<<a500+a100+a50+a10+a5+a1;
}

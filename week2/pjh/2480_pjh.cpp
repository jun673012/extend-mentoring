#include <iostream>
#include<algorithm>
using namespace std;
int main(){
    int a,b,c;
    cin>>a>>b>>c;
    int arr[3]={a,b,c};
    sort(arr,arr+3);
    if(a==b&&b==c){
        cout<<10000+a*1000;
    }
    else if(a!=b&&b!=c&&a!=c){
        cout<<arr[2]*100;
    }
    else{
        cout<<1000+arr[1]*100;
    }

    return 0;
}

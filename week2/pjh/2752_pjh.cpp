#include <iostream>
#include <algorithm>

using namespace std;
int main(){
    int a,b,c;
    int arr[3]={0,};
    cin>>a>>b>>c;
    arr[0]=a;
    arr[1]=b;
    arr[2]=c;
    sort(arr,arr+3);
    cout<<arr[0]<<" ";
    cout<<arr[1]<<" ";
    cout<<arr[2];

}

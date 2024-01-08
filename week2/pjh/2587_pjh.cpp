#include <iostream>
#include <algorithm>
using namespace std;
int main(){
    int sum=0;
    int arr[5]={0,};
    for(int x=0;x<5; x++){
        int a;
        cin >>a;
        arr[x]=a;
        sum+=a;
    }
    sort(arr,arr+5);
    cout<<sum/5<<"\n"<<arr[2];
}

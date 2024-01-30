#include <iostream>
#include <list>
#include <algorithm>
using namespace std;
int main(){
    int sum=0;
    int arr[9]={};
    for(int i=0; i<9; i++){
        cin>>arr[i];
        sum+=arr[i];
    }
    sort(arr,arr+9);
    list<int> list(begin(arr),end(arr));
    for(int j=0; j<8; j++){
        for(int k=j+1; k<9; k++){
            int sum1=sum;
            sum1=sum1-arr[j]-arr[k];
            if(sum1==100){
                list.remove(arr[j]);
                list.remove(arr[k]);
                goto EXIT;
            }
        }
    }
    EXIT:
    int arr1[7];
    copy(list.begin(), list.end(), arr1);
    for(int z=0; z<7; z++){
        cout<<arr1[z]<<endl;
    }
    

}

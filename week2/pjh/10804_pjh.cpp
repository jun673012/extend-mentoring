#include <iostream>
using namespace std;
int main(){
    int arr[20]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
    int temp;
    for(int i=0; i<10; i++){
        int a, b;
        cin>>a>>b;
        for (int j=0;j<(b-a+1)/2;j++){
            temp=arr[a-1+j];
            arr[a-1+j]=arr[b-1-j];
            arr[b-1-j]= temp;
        }
    }
    for (int k=0; k<20; k++){
        cout<<arr[k]<<" ";
    }
}



#include <iostream>
#include<algorithm>
using namespace std;

int main() {
    int a;
    cin>>a;
    int *array = new int[a]; 
    for (int i=0; i<a; i++){
        cin>>array[i];
    }
    
    sort(array,array+a);
    for(int j=0; j<a; j++){
        if(array[j-1]!=array[j]) cout<<array[j]<<" ";
    }
    delete [] array;
}

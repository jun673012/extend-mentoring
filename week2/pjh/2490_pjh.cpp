#include <iostream>
using namespace std;
int main(){
    int a,b,c,d;
    for(int j=0;j<3; j++){
        int count=0;
        cin>>a>>b>>c>>d;
        int arr[4]={a,b,c,d};
        for (int i = 0; i<4; i++){
            if(arr[i]==1)
                count++;
        }
        if(count==0)
            cout<<"D\n";
        if(count==1)
            cout<<"C\n";
        if(count==2)
            cout<<"B\n";
        if(count==3)
            cout<<"A\n";
        if(count==4)
            cout<<"E\n";
    }
}

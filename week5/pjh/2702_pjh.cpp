#include <iostream>
using namespace std;
int main(){
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    int z;
    cin>>z;
    for(int i=0; i<z; i++){
        int a,b,min=1,max=1;
        int j=2;
        cin>>a>>b;
        while(j<=a&&j<=b){
            if(a%j==0&&b%j==0){
                min*=j;
                a/=j;
                b/=j;
            }
            j++;
        
        }
        max=min*a*b;
        cout<<max<<" "<<min<<"\n";
    }
}

#include <iostream>
#include <cmath>
using namespace std;
 
int main() {
    unsigned long long a,b,min=100000000,sum=0;
    cin>>a>>b;
    for(int i=1; i<=int(sqrt(b)); i++){
        if(i*i>=a&&i*i<=b){
            sum+=i*i;
            if(min>i*i){
                min=i*i;
            }  
        }
    }
    if(sum==0) cout<<-1;
    else cout<<sum<<" "<<min;

}

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
        while(true){
            if(a%j==0&&b%j==0){
                min*=j;
                a/=j;
                b/=j;
            }
            else{
                if(j>a&&j>b){
                    break;
                }
                j++;
            }
        }
        max=min*a*b;
        cout<<max<<" "<<min<<"\n";
    }
    
}
//이상한 유클리드 호제법이란 방법을 쓰면 훨 간편히 풀 수 있음
#include <iostream>
 
using namespace std;
 
int gcd(int a, int b) {
    int r;
    while(b!=0){
        r=a%b;
        a=b;
        b=r;
    }
    return a;
}
 
int main() {
 
    int n;
    cin >> n;
 
    int a,b;
 
    for(int i=0; i<n; i++){
        
        cin>>a>>b;
 
        cout<<(a*b)/gcd(a, b)<<" ";
        cout<<gcd(a, b)<<"\n";
 
 
    }
 
}

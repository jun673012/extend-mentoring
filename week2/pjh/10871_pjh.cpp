#include <iostream>
using namespace std;
int main(){
    int a,b;
    cin>>a>>b;
    for(int i=0; i<a; i++){
        int x;
        cin>>x;
        if(b>x) cout<<x<<" ";
    }
}//412ms

#include <iostream>
using namespace std;
int main(){
    ios_base::sync_with_stdio(0);
	cin.tie(0);
    int a,b;
    cin>>a>>b;
    for(int i=0; i<a; i++){
        int x;
        cin>>x;
        if(b>x) cout<<x<<" ";
    }
}//0ms


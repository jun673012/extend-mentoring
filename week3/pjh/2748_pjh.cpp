#include <iostream>
using namespace std;
unsigned long long f(int a){
    if(a<=1) return a;
    else return f(a-1)+f(a-2);
}
int main(){
    int a;
    cin>>a;
    cout<<f(a);

}//재귀함수로 하는건 원래는 알고 있었지만 딱봐도 시간 초과로 틀릴꺼같아서 답지 참조함

#include <iostream>
using namespace std;
unsigned long long f(int n){
    unsigned long long fib[n+2];
    fib[0]=0;
    fib[1]=1;
    for (int i=2; i<=n;i++){
        fib[i]=fib[i-1]+fib[i-2];
    }
    return fib[n];
}
int main(){
    int a;
    cin>>a;
    cout<<f(a);

}//동적 프로그래밍?(각 숫자를 한번만 계산해서 재귀보다 훨씬 효율적)

#include<iostream> 
using namespace std;
const int MAX = 100;
long long fib[MAX] ={0};
long long fibonacci(int n) {
    if(n <= 1) return n;
    if(fib[n]) return fib[n];
    else return fib[n] = fibonacci(n-1) + fibonacci(n-2);
}
int main () {
    int n;
    cin >> n;
    cout << fibonacci(n);
    return 0;
}//메모이제이션??이라는 방식 (계산 결과를 저장 했다가 재활용하는 방식으로 연산시간을 줄이는데 효과적)

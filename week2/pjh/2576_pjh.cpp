#include <iostream>
#include <algorithm>
using namespace std;
int main(){
    int z,sum=0,i=0;
    int arr[7]={0,};
    for(int x=0;x<7; x++){
        int a;
        cin >>a;
        if(a%2!=0){
            arr[i]=a;
            i++;
        }
    }
    sort(arr,arr+7);
    for (int y=0; y<7; y++){
        sum+=arr[y];
    }
    cout<<sum<<endl;
}// 계속 최대한 간단히 하려고 노력하다가 짜증나서 다른 사람 꺼보는데 현타와서 이문제는 접을께요..ㅎ
#include <iostream>
using namespace std;
 
int main(void)
{
	ios::sync_with_stdio(0);
	cin.tie(0); cout.tie(0);
    
	int n, min = 100, sum = 0;
 
	for (int i = 0; i < 7; i++) {
		cin >> n;
		if (n % 2 == 1) {
			sum += n;
			if (n < min) min = n;
		}
	}
	if (sum == 0) cout << -1;
	else cout << sum << '\n' << min;
 
	return 0;
}//현타온 문제

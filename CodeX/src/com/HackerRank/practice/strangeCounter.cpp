//https://www.hackerrank.com/challenges/strange-code
#include <iostream>
#include <algorithm>
using namespace std; 
int main()
{
	long t;
	cin>>t;
	long a=3;
	while(t>a){
		t=t-a;
		a=a*2;
	}
	cout<<(a-t+1);
}
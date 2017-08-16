#include <iostream>
#include <algorithm>
using namespace std; 
int main()
{
	int t;
	cin>>t;
	while(t--){
		string s;
		cin>>s;
		bool val = next_permutation(s.begin(), s.end());
    	if (val == false)
	        cout << "no answer" << endl;
	    else
    	    cout << s << endl;
	}
    //string s = {"gfg"};
    return 0;
}
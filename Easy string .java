// { Driver Code Starts
#include <bits/stdc++.h>
using namespace std;
string transform(string s);

int main(){
    int t;
    cin >> t;
    while(t--){
        string s;
        cin >> s;
        cout << transform(s) << endl;
    }
return 0;
}

// } Driver Code Ends

char toLowerCase(char ch)
{
    return ch-'A'+'a';
}
string transform(string S){
    //complete the function here
    int i =0;
    int n = S.size();
    string str="";
    int count = 0;
    while(i < n)
    {
        int j = i;
            if(S[i] >= 'A' && S[i] <= 'Z')
            {
                S[i] = toLowerCase(S[i]);
            }
            while(j<n && S[i] == S[j])
            {
                j++;
                if(S[j] >= 'A' && S[j] <= 'Z')
                {
                    S[j] = toLowerCase(S[j]);
                }
                count++;
            }
            string cnt = to_string(count);
            str+=cnt;
            str+=S[i];
            i=j;
            count=0;
    }
    return str;
}


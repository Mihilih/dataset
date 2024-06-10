#include <iostream>
#include <stdlib.h>
using namespace std;

int main()
{
    string str;
    string tmp;
    int sum;

    while(1)
    {
        cin >> str;
        if(str == "0") break;
        sum = 0;
        for(int i=0;i<str.size();i++)
        {
            tmp = str[i];
            int num = atoi(tmp.c_str());
            sum += num;
        }
        
        cout << sum << endl;
    }
    return 0;
}


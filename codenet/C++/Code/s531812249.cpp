#include<iostream>
#include<math.h>
#include<iomanip>
#include<vector>
#include<algorithm>
#include<queue>
#include<string>
#include<stdlib.h>
using namespace std;
#define PI 3.14159265358979
typedef  long long ll;
#define rep(i,n) for(int i=0;i<n;i++)
#include<set>
//---------------------------------------------
 

int main(void)
{

int n,m;

cin>>n>>m;

//n gu m ki

int ans =0;
// gu gu
ans+= n*(n-1)/2;

//kiki
ans +=m*(m-1)/2;

cout<<ans<<endl;





}
#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
bool check(int n,int wei,vector<int> book)
{
  int tmp=wei;
  n--;
  for(int i=0;i<book.size();i++)
    {
      if(tmp<book[i])
	{
	  if(n>0)
	    {
	      n--;
	      tmp=wei;
	      if(tmp<book[i])
		return false;
	    }
	  else
	    return false;
	}
      //  cout<<n<<" "<<tmp<<" "<<book[i]<<endl; 
      tmp-=book[i];
    }
  return true;
}
int main()
{
  int m,n;
  for(;cin>>m>>n,m;)
    {
      vector<int> book;
      for(int i=0;i<n;i++)
	{
	  int tmp;
	  cin>>tmp;
	  book.push_back(tmp);
	}
      /*
      while(true)
	{
	  int tmp;
	  cin>>tmp;
	  if(check(m,tmp,book))
	      cout<<"YES"<<endl;
	  else
	      cout<<"NO"<<endl;
	}
      */

      int l=0;
      int r=1500000;
      int ans;
      while(l<r)
	{
	  //	  cout<<l<<" "<<r<<endl;
	  // cout<<(l+r)/2<<endl;
	  if(check(m,(l+r)/2,book))
	    {
	      ans=(l+r)/2;
	      if(r==(l+r)/2)
		break;
	      r=(l+r)/2;

	    }
	  else
	    {
	      if(l==(l+r)/2)
		break;
	      l=(l+r)/2;
	    }
	}
      cout<<ans<<endl;

    }
}
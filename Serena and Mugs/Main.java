#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,s,a[100],k=0,i;
  cin>>n>>s;
  for(i=0;i<n;i++)
    cin>>a[i];
   for(i=0;i<n;i++)
    k=k+a[i];
  if(k<=s)
    cout<<"YES";
  else
    cout<<"NO";
}
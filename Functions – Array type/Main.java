#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a[20],n,b,i,j,e=0,o=0;
  cout<<"Enter the number of elements in the array\n";
  cin>>n;
  cout<<"Enter the elements in the array\n";
  for(i=0;i<n;i++)
    cin>>a[i];
  for(i=0;i<n;i++){
    if(a[i]%2==0)
      e+=1;
    if(a[i]%2==1)
      o+=1;
  }
  if(e==n)
    cout<<"The array is Even";
  else if(o==n)
    cout<<"The array is Odd";
  else
   cout<<"The array is Mixed";
}
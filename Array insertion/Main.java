#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a[20],i,n,m,p;
  cout<<"Enter the number of elements in the array";
  cin>>n;
  cout<<"\nEnter the elements in the array\n";
  for(i=0;i<n;i++)
    cin>>a[i];
  cout<<"Enter the location where you wish to insert an element";
  cin>>m>>p;
  for(i=n;i>=m-1;i--)
    a[i+1]=a[i];
  a[m-1]=p;
  if(n<=m){
    cout<<"\nInvalid Input";}
  else{
  cout<<"\nEnter the value to insert"<<"\nArray after insertion is\n";
    for(i=0;i<=n;i++)
    cout<<a[i]<<"\n";}
  
    
  
}
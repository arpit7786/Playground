#include<iostream>
using namespace std;
int arrayType(int n, int *a);
int main()
{
  //Type your code here.
  cout<<"Enter the number of elements in the array"<<endl;
  int n;
  cin>>n;
  int a[n];
  cout<<"Enter the elements in the array"<<endl;
  for(int i=0;i<n;i++)
    cin>>a[i];
  if(arrayType(n,a) == 1)
    cout<<"The array is Even";
  else if(arrayType(n,a) == 2)
    cout<<"The array is Odd";
  else
    cout<<"The array is Mixed";
}
int arrayType(int n,int *a){
  int even=0,odd=0;
  for(int i=0;i<n;i++){
    if(a[i]%2==0)
      even++;
    else
      odd++;
  }
  if(even==0 && odd!=0)
    return 2;
  else if(even!=0 && odd==0)
    return 1;
  else 
    return 3;
}
  
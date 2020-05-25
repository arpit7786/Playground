#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int row,col;
  cin>>row>>col;
  int a[row][col];
  for(int i=0;i<row;i++){
    for(int j=0;j<col;j++){
      cin>>a[i][j];
    }
  }
  for(int i=0;i<row;i++){
    int sum=0;
    for(int j=0;j<col;j++){
      sum+=a[i][j];
    }
    cout<<sum<<endl;
  }
}
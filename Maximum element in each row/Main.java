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
    int max=0;
    for(int j=0;j<col;j++){
      max=max>a[i][j]?max:a[i][j];
    }
    cout<<max<<endl;
  }
}
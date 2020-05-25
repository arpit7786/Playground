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
  for(int i=0;i<col;i++){
    int max=0;
    for(int j=0;j<row;j++){
      max=max>a[j][i]?max:a[j][i];
    }
    cout<<max<<endl;
  }
}
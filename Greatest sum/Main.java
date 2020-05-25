#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int row,col,k,l;
  cin>>row>>col;
  int a[row][col];
  for(int i=0;i<row;i++){
    for(int j=0;j<col;j++){
      cin>>a[i][j];
    }
  }
  cout<<"Sum of rows is ";
  int max_row=0,max_col=0;
  for(int i=0;i<row;i++){
    int sum=0;
    for(int j=0;j<col;j++)
      sum += a[i][j];
    cout<<sum<<" ";
    if(sum>max_row){
      max_row=sum;
      k=i;
    }
    else{
      max_row = max_row;
    }
  }
  cout<<endl<<"Row "<<k+1<<" has maximum sum"<<endl;
  cout<<"Sum of columns is ";
  //int max_row=0,max_col=0;
  for(int i=0;i<col;i++){
    int sum=0;
    for(int j=0;j<row;j++)
      sum += a[j][i];
    cout<<sum<<" ";
    if(sum > max_col){
      max_col=sum;
      l=i;
    }
    else{
      max_col=max_col;
    }
  }
  cout<<endl<<"Column "<<l+1<<" has maximum sum";
}
#include<stdio.h>
int main(){
    int i,n;
    scanf("%d",&n);
  for(i=1;i<=n;i++){
      if(i%2!=0){
        printf("%d ",(i*i)-1);
      }else{
        printf("%d ",(i*i)-2);
      }
    }
  return 0;
}
#include<stdio.h>
int main()
{
    int num,res,mod;
    scanf("%d",&num);
    for(res=0;num>0;mod=num%10,res=res*10+mod,num/=10);
    printf("%d",res);
    return 0;
}
#include<stdio.h>
int main()
{
    int res,num,mod,safe;
    scanf("%d",&num);
    safe=num;
    for(res=0;num>0;mod=num%10,res=res*10+mod,num/=10);
    if(res==safe)
        printf("Palindrome");
    else
        printf("Not a Palindrome");
    return 0;
}
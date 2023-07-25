#include<stdio.h>
int main()
{
    int num,dig,rev=0,newnum=0;
    scanf("%d",&num);
    while(num>0)
    {
        dig=num%10;
        rev=rev*10+dig;
        num=num/10;
    }
    while(rev>0)
    {
        dig=rev%100;
        if(rev>9)
            newnum=newnum*100+dig;
        else
            newnum=newnum*10+dig;
        rev=rev/100;
    }
    printf("%d",newnum);
    return 0;
}